package com.baekjoon.greedy;

import java.util.*;

public class P2212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (N == K) {
            System.out.println(0);
            return ;
        }

        int[] r = new int[N];
        Integer[] d = new Integer[N-1];
        for (int i = 0; i < N; i++) {
            r[i] = sc.nextInt();
        }

        // 1 3 6 6 7 9
        Arrays.sort(r);

        for (int i = 1; i < N; i++) {
            d[i-1] = r[i] - r[i-1];
        }

        // 0 1 2 2 3
        Arrays.sort(d);

        int res = 0;
        for (int i = 0; i < N - 1 - (K - 1); i++) {
            res += d[i];
        }

        System.out.println(res);
    }
}
