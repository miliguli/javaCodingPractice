package org.example.java;

public class MissingElementInArray {

    public static void main(String[] args) {

        int[] num = {1,2,4,5};
        int sumWithMissingNum = 0;

        for (int i=1; i<6; i++)
        {
            sumWithMissingNum = sumWithMissingNum+i;
        }

        int sumWithoutMissingNum = 0;

        for (int j:num)
        {
            sumWithoutMissingNum = sumWithoutMissingNum+j;
        }

        System.out.println(sumWithMissingNum-sumWithoutMissingNum);
    }
}
