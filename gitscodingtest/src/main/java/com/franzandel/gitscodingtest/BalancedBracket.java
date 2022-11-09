package com.franzandel.gitscodingtest;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bracket = scanner.next();
        System.out.println(balancedBracket(bracket));
    }

    private static String balancedBracket(String bracket) {
        if (bracket.length() % 2 == 1) return "NO";

        HashMap<Character, Character> bracketPair = new HashMap<>();
        bracketPair.put('{', '}');
        bracketPair.put('[', ']');
        bracketPair.put('(', ')');

        Stack<Character> bracketStack = new Stack<>();
        for (int i = 0; i < bracket.length(); i++) {
            char current = bracket.charAt(i);
            char pair = bracketPair.getOrDefault(current, '0');
            if (pair != '0') {
                bracketStack.push(current);
            } else {
                if (bracketStack.isEmpty()) {
                    return "NO";
                } else {
                    char opening = bracketStack.peek();
                    if (bracketPair.getOrDefault(opening, '0') == current) {
                        bracketStack.pop();
                    } else {
                        return "NO";
                    }
                }
            }
        }

        return "YES";
    }
}
