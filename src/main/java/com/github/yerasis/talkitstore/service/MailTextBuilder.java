package com.github.yerasis.talkitstore.service;

public class MailTextBuilder {
    public static StringBuilder mailForRegistration(String key){
        // надо будет добавить ссылку на сайт
        StringBuilder sb = new StringBuilder("Благодарим вас за регистрацию на сайте ... . Вы можете "
                + "войти на сайт прямо сейчас введя ваш проверочный ключ указанный ниже в поле для регистрации: \n\n");
        sb.append(key + "\n\n");
        sb.append("<form action=\"\">\n" +
                "        <input type=\"submit\" value=\"Активировать аккаунт\" login=? password=? secretkey=?>\n" +
                "    </form>");//в параметре
        //не тестировал но должно работать
        return sb;
    }
    public static StringBuilder mailToEnter(String key){
        //Если забыли пароль
        //Тоже надо добавить ссылку для перехода на сайт
        StringBuilder sb = new StringBuilder("Здраствуйте. Вы послали запрос на восстановление пароля к вашей "
                + "учетной записи на сайте ... . Ваш новый пароль ниже: \n\n");
        sb.append(key + "\n\n");
        sb.append("Это одноразовый пароль и воспользоваться им можно будет только однажды. Но ничего не случиться, если им вы не воспользуетесь.\n");
        sb.append("<form action=\"\">\n" +
                "        <input type=\"submit\" value=\"Войти на сайт\" login=? password=? secretkey=?>\n" +
                "    </form>");
        return sb;
    }public static StringBuilder acсountCreated(){
        StringBuilder sb = new StringBuilder("Поздравляем! Ваш аккаунт успешно создан. Вы можете "
                + "войти на сайт ниже. \n\n");
        sb.append("");
        sb.append("<form action=\" \">\n" +
                "        <input type=\"submit\" value=\"Войти на сайт\" login=? password=? secretkey=?>\n" +
                "    </form>");
        return sb;
    }
}
