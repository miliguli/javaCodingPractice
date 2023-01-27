package org.example.java;

import java.util.Scanner;

public class FindTheLargestNumber2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please inter 1st Number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter 2st Number: ");
        int num2 = scanner.nextInt();
        System.out.println("Please enter 3st Number: ");
        int num3 = scanner.nextInt();

        if (num1>num2 && num1>num3)
        {
            System.out.println(num1 + " is the largest number");
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2 + " is the largest");
        }
        else
            System.out.println(num3+ " is the largest");


    }
}
