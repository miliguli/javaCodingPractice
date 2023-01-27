package org.example.java;

public class LocalInstanceVariable {

    int a = 1;

    int b = 3;


    public static void main(String[] args) {

        int c = 5;
        LocalInstanceVariable variable = new LocalInstanceVariable();
        int a1= variable.a;
        int b1= variable.b;

        System.out.println(c-a1-b1);

    }
}

