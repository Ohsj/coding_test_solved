package com.baekjoon.greedy;

/**
 * https://www.acmicpc.net/problem/2839
 */

import java.util.*;

public class P2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cnt = 0;
        while (true) {
            if (N % 5 == 0) {
                cnt += N / 5;
                break;
            } else {
                N -= 3;
                cnt += 1;
            }
            if (N < 0) {
                cnt = -1;
                break;
            }
        }
        System.out.println(cnt);
    }
}

/*
 * 17 0
 * 14 1
 * 11 2
 * 8  3
 * 5  4
 */
