package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/2847
 */

public class P2847 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (score[i + 1] <= score[i]) {
                int tmp = Math.abs(score[i+1] - score[i]) + 1;
                ans += tmp;
                score[i] -= tmp;
            }
        }
        System.out.println(ans);
    }
}
