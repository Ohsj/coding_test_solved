package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/11497
 */

public class P11497 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();

            int[] t = new int[n];
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                t[j] = sc.nextInt();
            }
            Arrays.sort(t);

            int s = 0;
            int e = n-1;
            int idx = 0;
            while (s <= e) {
                a[s++] = t[idx++];

                if (idx >= n) {
                    break;
                }

                a[e--] = t[idx++];
            }

            int min = Math.abs(a[0] - a[n-1]);
            for (int j = 1; j < n; j++) {
                min = Math.max(min, Math.abs(a[j-1] - a[j]));
            }
            System.out.println(min);
        }
    }
}
