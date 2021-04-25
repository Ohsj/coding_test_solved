package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/2720
 */

public class P2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] coins = new int[]{25, 10, 5, 1};
        int t = sc.nextInt();
        int[] money = new int[t];

        for (int i = 0; i < t; i++) {
            money[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            for (int coin : coins) {
                System.out.print(money[i] / coin + " ");
                money[i] %= coin;
            }
            System.out.println();
        }
    }
}
