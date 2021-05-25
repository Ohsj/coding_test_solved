package com.baekjoon.greedy;

import java.util.*;
/**
 * https://www.acmicpc.net/problem/11508
 */

public class P11508 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] costs = new Integer[n];
        for (int i = 0; i < n; i ++) {
            costs[i] = sc.nextInt();
        }

        Arrays.sort(costs, Collections.reverseOrder());

        int sum = costs[0];
        for (int i = 1; i < n; i++) {
            if (i % 3 != 2) {
                sum += costs[i];
            }
        }
        System.out.println(sum);
    }
}

// 6 5 5 / 5 5 4