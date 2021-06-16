package com.baekjoon.string;

/**
 * https://www.acmicpc.net/problem/10953
 */

import java.util.*;

public class P10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int a = Integer.parseInt(str.split(",")[0]);
            int b = Integer.parseInt(str.split(",")[1]);
            System.out.println(a + b);
        }


    }
}
