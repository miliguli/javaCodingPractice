package org.example.java;

public class OccuranceOfCharacter {

    public static void main(String[] args) {

        String s = "ana apple ";
        int beforeReplace = s.length();
        int afterReverse = s.replaceAll("a","").length();
        int occurance = beforeReplace - afterReverse;


        System.out.println(String.format("a  occurs  %s times ",occurance));
    }
}
