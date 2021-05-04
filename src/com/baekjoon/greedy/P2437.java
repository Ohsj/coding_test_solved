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

        int number = 1;
        while(true) {
            int cur = n - 1;
            int chk = 0;
            int tmp = number;
            boolean isHave = true;
            for (int i = cur; i >= 0; i--) {
                if (tmp >= w[i]) {
                    tmp -= w[i];
                    chk += w[i];
                }
            }

            if (chk != number) {
                isHave = false;
            }

            if(!isHave) {
                System.out.println(number);
                break;
            }
            number++;
        }
    }
}
