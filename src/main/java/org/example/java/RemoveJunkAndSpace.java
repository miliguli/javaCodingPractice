package org.example.java;

public class RemoveJunkAndSpace {

    public static void main(String[] args) {

        //remove special characters
        String str= "This#string%contains^special*characters&.";
        str = str.replaceAll("[^a-zA-Z0-9]", " ");

        System.out.println(str);
        System.out.println();


        //remove space

        String s = "This is    java    coding   ";
        String s2 = s.replaceAll("\\s", "");
        System.out.println(s2);
    }
}
