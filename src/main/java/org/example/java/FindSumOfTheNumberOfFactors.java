package org.example.java;

import java.util.Scanner;

public class FindSumOfTheNumberOfFactors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to check their factors :");

        int num = scanner.nextInt();
        int countOfFactors = 0;

        for (int i=1; i<=num; i++)
        {
            if (num%i==0)
            {
                System.out.println(i);
                countOfFactors++;
            }
        }
        System.out.println("Total Count of Factors are: "+countOfFactors);
    }
}
