package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/5585
 */

public class P5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] coins = {500, 100, 50, 10, 5, 1};
        int money = 1000 - sc.nextInt();

        int idx = 0;
        int res = 0;
        while (money > 0) {
            res += money / coins[idx];
            money = money % coins[idx];
            idx++;
        }

        System.out.println(res);
    }
}
