package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/2217
 */

public class P2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] ropes = new int[N];
        for (int i = 0; i < N; i++) {
            ropes[i] = sc.nextInt();
        }

        Arrays.sort(ropes);

        int max = 0;
        int cnt = ropes.length;
        for (int rope : ropes) {
            int tmp = rope * cnt;
            cnt --;

            if (tmp > max) {
                max = tmp;
            }
        }

        int lastRope = ropes[ropes.length - 1];
        if (lastRope > max) {
            max = lastRope;
        }
        System.out.println(max);
    }
}
