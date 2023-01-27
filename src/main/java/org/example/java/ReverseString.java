package org.example.java;

public class ReverseString {



    public void name(String n)
    {
       for (int i=n.length()-1; i>=0; i--)
       {
           System.out.println(n.charAt(i));
       }

    }


    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.name("Mily");

    }
}
