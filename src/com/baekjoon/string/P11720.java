package com.baekjoon.string;

import java.util.*;
/**
 * https://www.acmicpc.net/problem/11720
 */

public class P11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] str = sc.next().toCharArray();

        int res = 0;
        for (int i = 0; i < n; i++) {
            res += Character.digit(str[i], 10);
        }
        System.out.println(res);
    }
}
