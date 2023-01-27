package org.example.java;

public class CountNumberOfDigits {

    public static void main(String[] args) {

        int num = 1;
        int digitCount =0;

       while (num > 0)
       {
           num = num/10;
           digitCount++;
       }

        System.out.println(digitCount);
    }
}
