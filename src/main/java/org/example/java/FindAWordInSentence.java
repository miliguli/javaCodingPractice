package org.example.java;

public class FindAWordInSentence {

    public static void main(String[] args) {

        String sentence = "This is a simple Java coding";

        String word = "java";

        if (sentence.toLowerCase().indexOf(word)!=-1)
        {
            System.out.print("Yes, the word is in the sentence");
        }
        else
            System.out.print("No, not in it");
    }
}
