package com.algorithm;


// 프로그래머스 문자열을 정수로 바꾸기
public class Algorithm1_17 {
    public static int solution(String s) {
        boolean sign = true;
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                sign = false;
            } else if (s.charAt(i) != '+'){
                res = res * 10 + (s.charAt(i) - '0');
            }
        }
        return sign ? res : -1 * res;
    }

    public static void main(String[] args) {
        String ex1 = "-1234";
        String ex2 = "1234";
        System.out.println(solution(ex1));
        System.out.println(solution(ex2));
    }
}
