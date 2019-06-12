package com.github.yerasis.talkitstore.service;

public class MailTextBuilder {
    public static StringBuilder mailForRegistration(String key, String name){
        // надо будет добавить ссылку на сайт
        StringBuilder sb = new StringBuilder(name + ",\n\n");
        sb.append("Благодарим Вас за регистрацию на сайте ... . Вы можете "
                + "войти на сайт ... прямо сейчас введя ваш проверочный ключ указанный ниже в поле для регистрации: \n\n");
        sb.append("Вы можете войти на сайт, нажав на следующую ссылку или скопировав ее в адресную строку браузера: \n\n");
        sb.append("http://localhost:4200?login=?,password=?,key=" + key + "\n\n");
        sb.append("Это одноразовый вход и воспользоваться им можно лишь однажды. " +
                "После входа на сайт ... вы будете перенаправлены на страницу, где сможете установить свой пароль.");
        return sb;
    }
    public static StringBuilder mailToEnter(String key, String name){
        //Если забыли пароль
        StringBuilder sb = new StringBuilder(name + "\n\n");
        sb.append("Вы послали запрос на восстановление пароля к вашей учетной записи на сайте ...\n\n");
        sb.append("Вы можете войти на сайт, нажав на следующую ссылку или скопировав ее в адресную строку браузера: \n\n");
        sb.append("http://localhost:4200?login=?,password=?,key=" + key + "\n\n");
        sb.append("Это одноразовый вход и воспользоваться им можно лишь однажды. " +
                "После входа на сайт ... вы будете перенаправлены на страницу, где сможете сменить свой пароль.");
        return sb;
    }
}
