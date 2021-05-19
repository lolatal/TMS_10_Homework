/**
 * Класс исключение для логина
 */

package com.tms.exceptions.logindata;

public class WrongLoginException extends Exception{

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
