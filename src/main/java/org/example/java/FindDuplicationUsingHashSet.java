package org.example.java;

import java.util.HashSet;

public class FindDuplicationUsingHashSet {

    public static void main(String[] args) {

        int[] num = {2,3,4,4,6};

        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<num.length; i++)
        {
           if (set.add(num[i])==false)
           {
               System.out.println(num[i]+" is duplicate");
           }
        }
    }
}
