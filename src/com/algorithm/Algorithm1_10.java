package com.algorithm;

// 프로그래머스 두 정수 사이의 합
public class Algorithm1_10 {
    public static long solution(int a, int b) {
        long answer = 0;

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for (int i = min; i <= max; i++) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        int a1 = 3, b1 = 5, a2 = 3, b2 = 3, a3 = 5, b3 = 3;
        System.out.println(solution(a1, b1));
        System.out.println(solution(a2, b2));
        System.out.println(solution(a3, b3));
    }
}
