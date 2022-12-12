package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Reverse string: " + reverseOther("Somebody once told me"));
        System.out.println("Reverse string: " + reverseOther("Every other word is reversed in this sentence!"));

        System.out.println("Alternate letters: " + alternateLetters("Spongebob"));
        System.out.println("Alternate letters: " + alternateLetters("spongebob"));

        
    }

    public static String reverseOther(String sentence) {
        String[] split = sentence.split(" ");
        StringBuilder out = new StringBuilder();
        for (int i=0; i<split.length; i++) {
            if (i%2!=0) {
                char[] rev = new char[split[i].length()];
                for (int j=split[i].length()-1; j>=0; j--){
                    rev[rev.length-j-1] = split[i].toCharArray()[j];
                }
                out.append(new String(rev)).append(" ");
            } else {
                out.append(split[i]).append(" ");
            }
        }
        return out.toString().trim();
    }

    public static String alternateLetters(String word) {
        char[] wordArr = word.toCharArray();
        char[] out = new char[wordArr.length];
        if (Character.isUpperCase(wordArr[0])) {
            for (int i=0; i< wordArr.length; i++) {
                if (i%2==0) {
                    out[i] = Character.toUpperCase(wordArr[i]);
                } else {
                    out[i] = Character.toLowerCase(wordArr[i]);
                }
            }
        } else {
            for (int i=0; i< wordArr.length; i++) {
                if (i%2!=0) {
                    out[i] = Character.toUpperCase(wordArr[i]);
                } else {
                    out[i] = Character.toLowerCase(wordArr[i]);
                }
            }
        }
        return new String(out);
    }


}