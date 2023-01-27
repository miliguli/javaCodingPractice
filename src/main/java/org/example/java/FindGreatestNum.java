package org.example.java;

public class FindGreatestNum {

    public static void main(String[] args) {

        int a = 400;
        int b = 350;
        int c = 540;

        if (a>b & a>c)
        {
            System.out.println("a is the greatest: "+a);
        }
        //if a not the greatest num then if b>c then b is the greatest num
         else if (b>c)
        {
            System.out.println("b is the greatest: "+b);
        }
         else
            System.out.println("c is the greatest: "+c);
    }
}
