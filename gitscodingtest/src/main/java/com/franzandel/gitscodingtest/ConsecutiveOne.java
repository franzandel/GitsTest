package com.franzandel.gitscodingtest;

import java.util.Scanner;

public class ConsecutiveOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(consecutiveOne(array));
    }

    private static int consecutiveOne(int[] array) {
        int oneCount = 0;
        int tempOneCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                tempOneCount++;
                if (tempOneCount > oneCount) {
                    oneCount = tempOneCount;
                }
            } else {
                tempOneCount = 0;
            }
        }
        return oneCount;
    }
}
