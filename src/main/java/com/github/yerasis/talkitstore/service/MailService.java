package com.github.yerasis.talkitstore.service;

import com.github.yerasis.talkitstore.model.social.User;

public interface MailService {
  boolean sendMessage(String to, String subject, String text);

  String registrationMessageBuilder(String key, User user);

  String forgetPasswordMessageBuilder(String key, User user);


}
