package org.example.java;

import java.util.Scanner;

public class CountEvenOddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");

        int num = scanner.nextInt();

        scanner.close();

        int evenNum = 0;
        int oddNum = 0;


        while (num > 0) {
            int reminder = num % 10;

            if (reminder % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }

                num = num / 10;
            }
        System.out.println("even number is : "+ evenNum);
        System.out.println("odd number is:" +oddNum);
    }

}