package com.algorithm;

import java.util.*;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/77484?language=java
 */

public class Algorithm1_42 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int match = 0;

        for (int num :lottos) {
            if (num == 0) {
                zero ++;
            } else {
                if (Arrays.stream(win_nums).anyMatch(i -> i == num)) {
                    match++;
                }
            }
        }

        int min = Math.min(7 - (match + zero), 6);
        int max = Math.min(7 - match, 6);

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                new int[]{44, 1, 0, 0, 31, 25},
                new int[]{31, 10, 45, 1, 6, 19}
        )));
        System.out.println(Arrays.toString(solution(
                new int[]{0, 0, 0, 0, 0, 0},
                new int[]{38, 19, 20, 40, 15, 25}
        )));
        System.out.println(Arrays.toString(solution(
                new int[]{45, 4, 35, 20, 3, 9},
                new int[]{20, 9, 3, 45, 4, 35}
        )));
    }
}
