package org.example.java;

import java.util.Scanner;

public class FindVowels {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a character ");
        char c = scanner.next().charAt(0);

        boolean isVowel = false;

        switch (c)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': isVowel = true;

        }

        if (isVowel)
        {
            System.out.println(c + " is vowel");
        }
        else
            System.out.println(c+ " is not a vowel");


    }
}
