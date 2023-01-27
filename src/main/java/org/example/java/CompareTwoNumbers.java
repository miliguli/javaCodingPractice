package org.example.java;

import java.util.Scanner;

public class CompareTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter a number:");
        int first = scanner.nextInt();

        System.out.println("Please enter second number:");
        int second = scanner.nextInt();

        if (first == second)
        {
            System.out.println("two numbers are same");
        } else if (first>second)
        {
            System.out.println("First number is bigger");
        }
        else
            System.out.println("Second number is bigger ");

        scanner.close();


    }
}
