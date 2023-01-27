package org.example.java;

public class FindDuplicateElement {

    public static void main(String[] args) {

        int[] num = {2,3,4,4,6};

        for (int i=0; i<num.length; i++)
        {
            for (int j=i+1; j<num.length; j++)
            {
                if (num[i] == num[j])
                {
                    System.out.println(num[i]);
                }
            }
        }
    }
}
