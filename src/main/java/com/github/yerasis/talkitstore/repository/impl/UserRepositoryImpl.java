package com.github.yerasis.talkitstore.repository.impl;

import com.github.yerasis.talkitstore.model.social.User;
import com.github.yerasis.talkitstore.repository.UserRepository;
import com.github.yerasis.talkitstore.service.SqlMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {
  private final JdbcTemplate jdbcTemplate;

  @Override
  public int addUser(User user) {
    return jdbcTemplate.update("insert into \"user\"" +
        "(firstname, lastname, role, email, phone, cash, actual, password) " +
        "values(?,?,?,?,?,?,?,?)",
      user.getFirstName(), user.getLastName(), user.getRole(), user.getEmail(), user.getPhone(), user.getCash(),
      user.getActual(), user.getPassword());
  }

  @Override
  public User getUser(int id) {
    return jdbcTemplate.queryForObject("select * from \"user\" where id=?", this::mapRowToUser, id);
  }

  @Override
  public List<User> getUsers(Map<String, Object> params) {
    String sql = SqlMapper.sqlConstructor(new User(), params);
    return jdbcTemplate.query(sql, this::mapRowToUser);
  }

  @Override
  public int deleteUser(int id) {
    return jdbcTemplate.update("update \"user\" set actual=false where id=?", id);
  }

  @Override
  public int updateUser(User user) {
    return jdbcTemplate.update("update \"user\" set firstname=?, lastname=?," +
        "role=?,email=?,phone=?,cash=?,actual=?,password=? where id=?",
      user.getFirstName(), user.getLastName(), user.getRole(), user.getEmail(),
      user.getPhone(), user.getCash(), user.getActual(), user.getPassword(),
      user.getId());
  }

  private User mapRowToUser(ResultSet rs, int id) throws SQLException {
    return new User(rs.getInt("id"),
      rs.getString("firstname"),
      rs.getString("lastname"),
      rs.getString("role"),
      rs.getString("email"),
      rs.getString("phone"),
      rs.getInt("cash"),
      rs.getBoolean("actual"),
      rs.getString("password"));
  }

}
