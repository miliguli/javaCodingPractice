package org.example.java;

public class Converting {

    public static void main(String[] args) {

        //convert string to integer
        String s = "100";
        int i = Integer.parseInt(s);
        System.out.println(i);
        System.out.println();

        //convert Integer to String
        int j = 150;
        String m = String.valueOf(j);
        System.out.println(m);
        System.out.println();

        //Convert String into Double
        String n = "13.65";
        double d = Double.valueOf(n);
        System.out.println(d);
        System.out.println();

        //convert string to boolean
        String k = "true";
        boolean b = Boolean.valueOf(k);
        System.out.println(!b);
    }
}
