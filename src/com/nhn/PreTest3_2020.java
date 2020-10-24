package com.nhn;

import java.util.*;

public class PreTest3_2020 {
    private static void appendRepeatNum(StringBuilder sb, char number) {
        int num = Integer.parseInt(String.valueOf(number));
        sb.append(sb.toString().repeat(num - 1));
    }

    private static void appendAllChar(StringBuilder sb, char c) {
        int num = sb.length();
        int idx = 0;
        for (int k = 0; k < num; k++) {
            sb.insert(idx, c);
            idx += 2;
        }
    }

    private static void solution(int numOfOrder, String[] orderArr) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] cur;
        char tmp, next;
        int num;

        for (int i = 0; i < numOfOrder; i++) {
            cur = orderArr[i].toCharArray();
            for (char c : cur) {
                if (c == ')') {
                    // 닫는 괄호를 만나면 추가했던 요소 계산 시작
                    while (!stack.isEmpty()) {
                        tmp = stack.pop();
                        if (tmp == '(') {
                            next = stack.pop();
                            if (next >= '0' && next <= '9') // 숫자일 경우 그 수만큼 반복해서 붙이기
                                appendRepeatNum(sb, next);
                            else // 문자일 경우 사이사이에 괄호 앞 문자 추가해주기
                                appendAllChar(sb, next);
                        } else {
                            if (tmp >= '0' && tmp <= '9') // 숫자일 경우 그 수만큼 반복해서 넣기
                                appendRepeatNum(sb, tmp);
                            else // 문자일 경우 그냥 넣기
                                sb.insert(0, tmp);
                        }
                    }
                } else // 닫는 괄호가 아니라면 스택에 추가
                    stack.add(c);
            }
            // 괄호가 하나도 없고 숫자와 알파벳으로만 이루어 진 경우
            if (sb.length() == 0) {
                while (!stack.isEmpty()) {
                    tmp = stack.pop();
                    num = Integer.parseInt(String.valueOf(stack.pop()));
                    sb.insert(0, String.valueOf(tmp).repeat(num));
                }
            }

            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }

    public static void main(String[] args) {
        // BRGRG RGBGBRGBGBRGBGB
        solution(2, new String[]{"B2(RG)", "3(R2(GB))"});

        //BRRRBRRRBRRR BRBGBBBRBBBG BRRGGG
        solution(3, new String[]{"3(BR2(R))", "B(RGB(RG))", "1B2R3G"});
    }
}
