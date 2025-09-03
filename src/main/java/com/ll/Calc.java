package com.ll;

public class Calc {
    public static int run(String str) {
        // 공백 제거
        str = str.replace(" ", "");

        // '+' 연산자로 분리
        String[] parts = str.split("\\+");

        int result = 0;
        for (String part : parts) {
            result += Integer.parseInt(part);
        }
        return result;
    }
}

