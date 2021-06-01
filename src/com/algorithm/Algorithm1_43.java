package com.algorithm;

/**
 *  https://programmers.co.kr/learn/courses/30/lessons/76501
 */

public class Algorithm1_43 {
    public static int solution(int[] absolutes, boolean[] signs) {
        int res = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                res += absolutes[i];
            } else {
                res -= absolutes[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
        System.out.println(solution(new int[]{1, 2, 3}, new boolean[]{false, false, true}));
    }
}
