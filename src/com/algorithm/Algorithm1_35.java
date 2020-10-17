package com.algorithm;

import java.util.Arrays;

public class Algorithm1_35 {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = ((long)x * (i + 1));
        }
        return answer;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solution(2, 5)));
//        System.out.println(Arrays.toString(solution(4, 3)));
//        System.out.println(Arrays.toString(solution(-4, 2)));
        System.out.println(Arrays.toString(solution(10000000, 1000)));

    }
}
