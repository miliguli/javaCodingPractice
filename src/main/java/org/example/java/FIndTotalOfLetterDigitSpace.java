package org.example.java;

import java.util.Scanner;

public class FIndTotalOfLetterDigitSpace {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter: ");
        String s = scanner.nextLine();
        char[] ca = s.toCharArray();
        scanner.close();

        int letterCount = 0;
        int digitsCount = 0;
        int spaceCount = 0;
        int otherCount = 0;

        for (Character c : ca)
        {
            if (Character.isDigit(c))
            {
               digitsCount++;
            }
            else if (Character.isLetter(c))
            {
                letterCount++;
            }
            else if (Character.isSpaceChar(c))
            {
                spaceCount++;
            }
            else{
                otherCount++;
            }
        }

        System.out.println("Number of digits are: "+digitsCount);
        System.out.println("Number of letters are: "+letterCount);
        System.out.println("Number of space are: "+spaceCount);
        System.out.println("others are: "+otherCount);


    }
}