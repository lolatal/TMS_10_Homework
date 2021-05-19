/**
 * Метод (выбрасывает исключения) на проверку соответствия пароля и логина требованиям
 */

package com.tms.exceptions.logindata;

public class UserInfo {

    public static boolean userInformationCheck(String login, String password, String confirmPassword) throws Exception {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Введенные логин и пароль не соответствуют требованиям");
        }
        else if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Введенные логин и пароль не соответствуют требованиям");
        }
        else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Введенные логин и пароль не соответствуют требованиям");
        }
        else {
            return true;
        }
    }
}




