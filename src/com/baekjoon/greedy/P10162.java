package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/10162
 */

public class P10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] times = {300, 60, 10};

        int T = sc.nextInt();

        if (T % 10 != 0) {
            System.out.println(-1);
        } else {
            int[] res = new int[times.length];

            for (int i = 0; i < 3; i++) {
                res[i] = T / times[i];
                T %= times[i];
            }

            for (int re : res) {
                System.out.println(re);
            }
        }
    }
}
