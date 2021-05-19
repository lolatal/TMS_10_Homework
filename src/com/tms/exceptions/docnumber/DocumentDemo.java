/**
 * Здесь вызываются методы для проверки на наличие последовательностей
 */

package com.tms.exceptions.docnumber;

import java.util.Scanner;

public class DocumentDemo {

    public static void main(String[] args) {
        System.out.println("Введите номер документа: ");
        Scanner scanner = new Scanner(System.in);
        String inputDocNumber = scanner.next();

        System.out.println("Проверка на наличие последовательностей в строке: ");

        try{
            DocNumber.startsWithCertainNumbers(inputDocNumber);
        }catch (DocNumberException e){
            System.out.println(e.getMessage());
        }

        try{
            DocNumber.containsABCSequence(inputDocNumber);
        } catch (DocNumberException e) {
            System.out.println(e.getMessage());
        }

        try{
            DocNumber.endsWithSequence(inputDocNumber);
        }catch (DocNumberException e){
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

}
