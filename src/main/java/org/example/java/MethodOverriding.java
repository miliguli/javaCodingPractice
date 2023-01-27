package org.example.java;

public class MethodOverriding {

    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
    }


    class A
    {
        public void show()
        {
            System.out.println("in A class");
        }
    }

    class B extends ForLoop
    {
        public void show()
        {
            System.out.println(" in B class");
        }
    }

