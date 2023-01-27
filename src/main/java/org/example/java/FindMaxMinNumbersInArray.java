package org.example.java;

public class FindMaxMinNumbersInArray {

    public static void main(String[] args) {

        int[] num ={10,20,35,50,100};
        int max = 0;
        int min = 0;

        for (int i=0; i<num.length; i++)
        {
            if (max<num[i])
            {
                max = num[i];
            }
            if (min>num[i])
            {
                System.out.println(min = num[i]);
            }
        }

        System.out.println("Max number is: "+ max+"\nMin Number is: "+min);
    }
}
