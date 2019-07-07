package com.github.yerasis.talkitstore.repository;

import com.github.yerasis.talkitstore.model.social.User;

import java.util.List;
import java.util.Map;

public interface UserRepository {

  int addUser(User user);

  User getUser(int id);

  List<User> getUsers(Map<String,Object> params);

  int deleteUser(int id);

  int updateUser(User user);
}
