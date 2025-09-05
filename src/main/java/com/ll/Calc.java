package com.ll;

public class Calc {
    public static int run(String str) {
        int result = 0;

        // 공백 제거
        str = str.replace(" ", "");

        // 피연산자 분리
        String[] operands = str.split("\\+");

        // 계산
        for (String operand : operands) {
            result += Integer.parseInt(operand);
        }

        return result;
    }
}

