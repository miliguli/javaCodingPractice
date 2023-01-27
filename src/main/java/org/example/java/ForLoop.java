package org.example.java;

public class ForLoop {

    public static void main(String[] args) {


        for (int i=1; i<=10; i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();


        //using while loop
        int j=1;
        while (j<=10)
        {

            System.out.print(j+" ");
            j++;
        }
        System.out.println();


        //print 10-1

        for (int i=10; i>=1; i--)
        {
            System.out.print(i+" ");
        }
    }
}
