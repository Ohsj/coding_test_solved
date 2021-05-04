package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/2437
 */

public class P2437 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];

        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }

        Arrays.sort(w);

        if (w[0] != 1) {
            System.out.println(1);
            return;
        }

        int sum = w[0];
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (sum + 1 < w[i]) {
                ans = sum + 1;
                break;
            }
            sum += w[i];
        }

        if (ans == 0) ans = sum + 1;
        System.out.println(ans);
    }
}
