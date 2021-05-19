/**
 * Класс исключения на номер документа
 */

package com.tms.exceptions.docnumber;

public class DocNumberException extends Exception{

    public DocNumberException(String message) {
        super(message);
    }

}
