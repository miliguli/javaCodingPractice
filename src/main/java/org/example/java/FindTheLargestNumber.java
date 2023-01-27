package org.example.java;

public class FindTheLargestNumber {

    public static void main(String[] args) {
        int[] a = {2,5,1,7,3,9};

        int max = 0;

        for (int i=0; i<a.length; i++)
        {
            if (max<a[i])
            {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
