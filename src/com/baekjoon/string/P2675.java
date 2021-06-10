package com.baekjoon.string;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/2675
 */

public class P2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String[] s = sc.next().split("");
            StringBuilder sb = new StringBuilder();
            for (String str : s) {
                sb.append(String.valueOf(str).repeat(r));
            }
            System.out.println(sb);
        }
    }
}
