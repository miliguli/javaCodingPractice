package org.example.java;

public class PalindromeString {

    public static void main(String[] args) {

        String s = "dad";
        String reverse ="";



        for (int j = s.length() - 1; j >= 0; j--)
        {
            reverse=reverse+s.charAt(j);
        }

        if(s.equals(reverse))
        {
            System.out.println("is palindrome");
        }
        else
            System.out.println("not ");
    }
}
