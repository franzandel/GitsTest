package com.franzandel.gitscodingtest;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(recursiveReverse(word.toCharArray()));
    }

    private static char[] recursiveReverse(char[] word) {
        return recursiveReverseHelper(word, 0, word.length - 1);
    }

    private static char[] recursiveReverseHelper(char[] word, int lowerIndex, int upperIndex) {
        if (lowerIndex >= upperIndex) return word;

        char temp = word[lowerIndex];
        word[lowerIndex] = word[upperIndex];
        word[upperIndex] = temp;
        return recursiveReverseHelper(word, lowerIndex + 1, upperIndex - 1);
    }
}
