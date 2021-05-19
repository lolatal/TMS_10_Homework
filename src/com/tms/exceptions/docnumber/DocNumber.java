/**
 * Класс с методами (бросающими исключение) для проверки на наличие определенных последовательностей
 */

package com.tms.exceptions.docnumber;

public class DocNumber {

    public static void startsWithCertainNumbers(String s) throws DocNumberException {
        if (s.startsWith("555")) {
            System.out.println("Номер документа начинается с последовательности 555");
        } else {
            throw new DocNumberException("Номер документа не начинается с последовательности 555");
        }
    }

    public static void endsWithSequence(String s) throws DocNumberException {
        String sequence = "1a2b";
        if (s.endsWith(sequence) || s.endsWith(sequence.toUpperCase())) {
            System.out.println("Номер документа заканчивается последовательностью 1a2b");
        } else {
            throw new DocNumberException("Номер документа не заканчивается последовательностью 1a2b");
        }
    }

    public static void containsABCSequence(String s) throws DocNumberException {
        String sequence = "abc";
        if (s.contains(sequence) || s.contains(sequence.toUpperCase())) {
            System.out.println("Номер документа содержит последовательность abc");
        } else {
            throw new DocNumberException("Номер документа не содержит последовательность abc");
        }
    }
}
