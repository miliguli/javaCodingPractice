package org.example.java;

public class CapitalizeEachLetter {

    public static void main(String[] args) {

        String str = "This is a simple statement";
        String[] sa = str.split(" ");
        String capitalizedStatement = "";
        for (int i=0; i<sa.length; i++)
        {
            String word = sa[i];
            char[] ca = word.toCharArray();
            String firstChar = String.valueOf(ca[0]);
            String capitalizedWord = firstChar.toUpperCase();

            for (int j=1; j<ca.length; j++)
            {
                capitalizedWord = capitalizedWord+ca[j];
            }

            capitalizedStatement = capitalizedStatement+capitalizedWord+" ";
        }

        System.out.println(capitalizedStatement);

    }
}
