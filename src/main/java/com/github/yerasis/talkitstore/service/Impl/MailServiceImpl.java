package com.github.yerasis.talkitstore.service.Impl;


import com.github.yerasis.talkitstore.model.social.User;
import com.github.yerasis.talkitstore.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailServiceImpl implements MailService {
  public final JavaMailSender mailSender;

  @Override
  public boolean sendMessage(String to, String subject, String text) {
    try {
      SimpleMailMessage message = new SimpleMailMessage();
      message.setTo(to);
      message.setSubject(subject);
      message.setText(text);
      mailSender.send(message);
    } catch (MailException e) {
      System.err.println("Message send fail" + e);
      return false;
    }
    return true;
  }

  @Override
  public String registrationMessageBuilder(String key, User user) {
    // надо будет добавить ссылку на сайт
    StringBuilder builder = new StringBuilder(user.getFirstName() + ",\n\n");
    builder.append("Благодарим Вас за регистрацию на сайте ... . \n\n");
    builder.append("Вы можете подтвердить регистрацию, перейдя по ссылке или скопировав ее в адресную строку браузера: \n\n");
    builder.append("http://localhost:4200?login=?,password=?,key=").append(key).append("\n\n");
    builder.append("Это одноразовый вход и воспользоваться им можно лишь однажды.");
    return builder.toString();
  }

  @Override
  public String forgetPasswordMessageBuilder(String key, User user) {
    StringBuilder builder = new StringBuilder(user.getFirstName() + "\n\n");
    builder.append("Вы послали запрос на восстановление пароля к вашей учетной записи на сайте ...\n\n");
    builder.append("Вы можете войти на сайт, нажав на следующую ссылку или скопировав ее в адресную строку браузера: \n\n");
    builder.append("http://localhost:4200?login=?,password=?,key=").append(key).append("\n\n");
    builder.append("Это одноразовый вход и воспользоваться им можно лишь однажды. " +
      "После входа на сайт ... вы будете перенаправлены на страницу, где сможете сменить свой пароль.");
    return builder.toString();
  }

}
