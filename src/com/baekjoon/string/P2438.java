package com.baekjoon.string;

import java.util.*;
/**
 * https://www.acmicpc.net/problem/2438
 */

public class P2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
