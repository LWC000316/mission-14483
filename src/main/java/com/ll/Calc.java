package com.ll;

public class Calc {

    public static int run(String str) {
        String[] tokens = str.trim().split(" ");
        return calc(tokens, 0, tokens.length - 1);
    }

    private static int calc(String[] tokens, int start, int end) {
        // 종료조건
        if (start == end) {
            return Integer.parseInt(tokens[start]);
        }

        for (int i = end - 1; i > start; i -= 2) {
            if (tokens[i].equals("+") || tokens[i].equals("-")) {
                int left = calc(tokens, start, i - 1);
                int right = calc(tokens, i + 1, end);
                return tokens[i].equals("+") ? left + right : left - right;
            }
        }

        for (int i = end - 1; i > start; i -= 2) {
            if (tokens[i].equals("*")) {
                int left = calc(tokens, start, i - 1);
                int right = calc(tokens, i + 1, end);
                return left * right;
            }
        }

        throw new IllegalArgumentException("잘못된 수식");
    }
}