package org.example.java;

import java.util.Scanner;

public class ScannerToPrint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name : ");
        String name = scanner.next();
        System.out.println(name);

        System.out.println("please enter your age");
        int age = scanner.nextInt();
        System.out.println(age);
    }
}
