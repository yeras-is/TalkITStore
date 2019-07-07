package com.github.yerasis.talkitstore.business;

import com.github.yerasis.talkitstore.model.social.User;

import java.util.List;
import java.util.Map;

public interface UserBusiness {

  int addUser(User book);

  User getUser(int id);

  List<User> getUsers(Map<String,Object> params);

  int deleteUser(int id);

  int updateUser(User book);

}
