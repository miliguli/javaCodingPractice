package org.example.java;

public class FindGivenElementInArray {

    public static void main(String[] args) {

        int[] num = {10,5,20,50};

        int searchNum = 5;

        boolean found = false;

        for (int i=0; i<num.length; i++)
        {
            if (num[i]==searchNum)
            {
                System.out.println(num[i]);
                found=true;
            }

            }
        if (!found)
        {
            System.out.println("Not Found");
            found = false;
        }
    }
}
