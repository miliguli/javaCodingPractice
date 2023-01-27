package org.example.java;

public class printEvenOddNumbersInArray {

    public static void main(String[] args) {

        int[] num = {2,4,6,1,7,9};

        System.out.println("below are the even numbers: ");

        for (int i : num)
        {
            if (i % 2 ==0)
            {
                System.out.println(i+ " ");
            }
        }
        System.out.println();

        System.out.println("below are the odd numbers: ");
        for (int j: num)
        {
            if (j%2!=0)
            {
                System.out.println(j+ " ");
            }
        }
    }
}
