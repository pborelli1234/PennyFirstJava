//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.codewithpenny;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello welcome to my first java application in a long time.");

        //Primitive types
        int myAge = 30;
        int herAge = myAge;

        System.out.println(herAge);

        byte age = 30;
        int viewsCount = 123_456_789;
        long longCount = 30384928948298249L;
        double price = 10.99;
        float todayPrice = 10.99F;
        char letter = 'E';
        boolean isEligible = true;
        Date todayDate = new Date();

        System.out.println(todayDate);

        String message = "Hello World!!";
        int messageLength = message.length();

        System.out.println(message);
        System.out.println(messageLength);
        System.out.println(message.toLowerCase());

        int eIndex = message.indexOf("e");
        System.out.println(eIndex);

        //using double quote in string - special characters
        String newMessage = "Hello \"Penny\"";
        System.out.println(newMessage);

        //use double backslash in string
        String path = "c:\\Windows\\...";
        System.out.println(path);

        //Arrays
        //int[] numbers = new int[5];
        //numbers[0] = 1;
        //numbers[1] = 10;
        //numbers[2] = 7;
        //numbers[3] = 4;
        //numbers[4] = 9;

        int[] numbers = { 2, 5, 7, 8, 14, 9, 20, 11 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("i " + i);
            System.out.println("number: " + numbers[i]);
        }

        System.out.println();
        System.out.println(Arrays.toString(numbers));

        //Multi-dimentional arrays
        //int[][] multiNumbers = new int[2][4];
        int[][] multiNumbers = { { 1, 2, 4 }, { 4, 5, 6 } };
        //multiNumbers[0][0]  = 1;

        System.out.println();
        System.out.println(Arrays.deepToString(multiNumbers));

        //Constants - use capital letters
        final float PI = 8.14F;
        System.out.println(PI);
        System.out.println();

        //Arithmetic Expressions
        double result = (double)10 / (double)3;
        result = result*100;
        result = Math.round(result);
        result = result /100;
        System.out.println(result);

        //incrementing a number
        int x = 1;
        int y = x++;
        x += 8;
        System.out.println(y);
        System.out.println(x);
    }
}