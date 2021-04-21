package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/11399
 */

public class P11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] time = new int[N];
        for (int i = 0; i < N; i++) {
            time[i] = sc.nextInt();
        }

        int[] arr = Arrays.stream(time).sorted().toArray();
        int sum = 0;
        int res = 0;
        for (int i : arr) {
            sum = sum + i;
            res += sum;
        }
        System.out.println(res);
    }
}
