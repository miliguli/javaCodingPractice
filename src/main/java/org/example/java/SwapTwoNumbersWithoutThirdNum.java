package org.example.java;

public class SwapTwoNumbersWithoutThirdNum {

    public static void main(String[] args) {

        int a = 2;
        int b = 4;

        a = a+b; //6
        b = a-b; //2
        a = a-b;

        System.out.println(a+ " "+b+" ");
    }
}
