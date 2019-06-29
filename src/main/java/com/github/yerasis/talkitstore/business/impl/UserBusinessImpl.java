package com.github.yerasis.talkitstore.business.impl;

import com.github.yerasis.talkitstore.business.UserBusiness;
import com.github.yerasis.talkitstore.model.User;
import com.github.yerasis.talkitstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
public class UserBusinessImpl implements UserBusiness {
  private final UserRepository userRepository;

  @Override
  public int addUser(User book) {
    throw new IllegalArgumentException("not impl");
  }

  @Override
  public User getUser(int id) {
    throw new IllegalArgumentException("not impl");
  }

  @Override
  public List<User> getUsers(Map<String, Object> params) {
    throw new IllegalArgumentException("not impl");
  }

  @Override
  public int deleteUser(int id) {
    throw new IllegalArgumentException("not impl");
  }

  @Override
  public int updateUser(User book) {
    throw new IllegalArgumentException("not impl");
  }
}
