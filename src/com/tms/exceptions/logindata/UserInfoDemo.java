/**
 * Класс, в котором вызывается метод на проверку логина и пароля
 */

package com.tms.exceptions.logindata;

public class UserInfoDemo {
    public static void main(String[] args) {
        try {
            UserInfo.userInformationCheck("Olga", "qwerty", "qwerty1");
            System.out.println("Введенные логин и пароль соответствуют требованиям");
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
