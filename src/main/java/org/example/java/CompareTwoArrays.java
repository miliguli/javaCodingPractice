package org.example.java;

import java.util.Arrays;

public class CompareTwoArrays {

    public static void main(String[] args) {

        int[] num1 = {1,2,3,4};
        int[] num2 = {1,2,3,4,6};

        if (Arrays.equals(num1,num2))
        {
            System.out.println("same");
        }
        else
            System.out.println("Different");

    }
}
