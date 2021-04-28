package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/13305
 */

public class P13305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] direction = new int[n - 1];
        int[] price = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            direction[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            price[i] = sc.nextInt();
        }

        long sum = 0;
        int min = price[0];
        for(int i = 0; i < price.length; i++) {
            min = Math.min(min, price[i]);
            sum += (long)direction[i] * min;
        }

        System.out.println(sum);
    }
}
