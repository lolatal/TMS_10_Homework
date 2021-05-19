/**
 * Класс исключение для пароля
 */

package com.tms.exceptions.logindata;

public class WrongPasswordException extends Exception{

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
