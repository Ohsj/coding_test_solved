package com.algorithm;

// 프로그래머스 수박수박수박수박수박수?
public class Algorithm1_16 {
    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) sb.append("수");
            else sb.append("박");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }
}
