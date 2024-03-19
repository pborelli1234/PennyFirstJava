//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.codewithpenny;

import java.util.*;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello welcome to my first java application in a long time.");

        //MyTypes();

        //Calculate morgage
        final byte MONTHSINYEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: ");
        int principle = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHSINYEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHSINYEAR;

        double morgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String morgageFormatted = NumberFormat.getCurrencyInstance().format(morgage);
        System.out.println("Morgage: " + morgageFormatted);
    }

    private static void MyTypes() {
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

        //result will be 16
        int numX = 10 + 3 * 2;
        System.out.println(numX);

        //result will be 26
        int numY = (10 + 3) * 2;
        System.out.println(numY);

        //Implicit casting - automatic conversion
        short shortX = 1;
        int intY = x + 2;

        System.out.println();
        System.out.println(intY);

        //java will automatically cast 2 to a double
        //Explicit casting
        double doubleX = 1.1;
        double doubleY = x + 2;

        System.out.println(doubleY);

        //convert string to integer
        String newX = "1";
        int newY = Integer.parseInt(newX) + 2;

        System.out.println(newY);
        System.out.println();

        //Math Class
        int result1 = Math.round(1.1F);
        System.out.println(result1);

        int result2 = (int)Math.ceil(1.1F);
        System.out.println(result2);

        //returns the greater number
        int floor1 = Math.max(1, 5);
        System.out.println(floor1);

        //returns the minimum number
        int floor2 = Math.min(2, 5);
        System.out.println(floor2);

        //gets a value between 1 and 100
        int random1 = (int)Math.round(Math.random() * 100);
        System.out.println(random1);

        //Number Format - currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyStr = currency.format(1234567.891);
        System.out.println(currencyStr);

        //Number Format - percent
        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentStr = percent.format(0.1);
        System.out.println(percentStr);

        String percent2 = NumberFormat.getPercentInstance().format(0.45);
        System.out.println(percent2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name:  ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);
    }
}