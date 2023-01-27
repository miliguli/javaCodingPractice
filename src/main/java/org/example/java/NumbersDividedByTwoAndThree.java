package org.example.java;

public class NumbersDividedByTwoAndThree {

    public static void main(String[] args) {

        //find the numbers divided by 2 and 3 between 1-25

        for (int i=1; i<=25; i++)
        {
            if (i%2==0 && i%3==0)
            {
                System.out.println(i);
            }
        }
    }
}
