package org.example.java;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        //for each loop
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(23);
        numList.add(100);

        for (Integer in:numList)
        {
            System.out.println(in);
        }


        //for loop
        ArrayList<String> names = new ArrayList<>();
        names.add("Hawa");
        names.add("Maysa");
        names.add("big");

        for (int i=0; i<names.size(); i++)
        {
            System.out.println(names.get(i));
        }
    }
}
