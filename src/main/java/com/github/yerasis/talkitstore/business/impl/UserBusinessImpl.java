package com.github.yerasis.talkitstore.business.impl;

import com.github.yerasis.talkitstore.business.UserBusiness;
import com.github.yerasis.talkitstore.model.social.User;
import com.github.yerasis.talkitstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
public class UserBusinessImpl implements UserBusiness {
  private final UserRepository userRepository;

  @Override
  public int addUser(User user) {
    return userRepository.addUser(user);
  }

  @Override
  public User getUser(int id) {
    return userRepository.getUser(id);
  }

  @Override
  public List<User> getUsers(Map<String, Object> params) {
    return userRepository.getUsers(params);
  }

  @Override
  public int deleteUser(int id) {
    return userRepository.deleteUser(id);
  }

  @Override
  public int updateUser(User user) {
    return userRepository.updateUser(user);
  }
}
