package org.example.java;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorA {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Sam");
        names.add("Tom");
        names.add("Big");

        Iterator iterator = names.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
