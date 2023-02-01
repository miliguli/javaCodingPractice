package org.example.java;

public class DevidedByFive {

    public static void main(String[] args) {

       for (int i=1; i<=100; i++)
       {
           if (i%5 == 0)
           {
               System.out.println(String.format("this number can divided by 5 : %s",i));
           }
           else
           {
               System.out.println(i);
           }


       }
    }
}
