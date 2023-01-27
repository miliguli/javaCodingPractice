package org.example.java;

public class SumOfAllNumbers {

    public static void main(String[] args) {

        int[] num = {2,4,10,20};

        int sum = 0;

        for (int i=0; i<num.length; i++)
        {
            sum= sum+num[i];
        }

        System.out.println(sum);
    }
}
