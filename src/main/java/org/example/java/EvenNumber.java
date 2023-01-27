package org.example.java;

import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number to check if it is an even number: ");
        int num = scanner.nextInt();

        if (num%2 == 0)
        {
            System.out.println(num+ " is an even number ");
        }
        else
            System.out.println(num+ " is not an even number ");
    }
}
