package org.example.java;

public class PrintOddNumbers {

    public static void main(String[] args) {

        //print odd numbers from 1 to 10

        for (int i=1; i<=10; i++)
        {
            if (i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
