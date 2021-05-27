package com.baekjoon.string;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/10809
 */

public class P10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();

        int[] res = new int[26];
        Arrays.fill(res, -1);

        for (int i = 0; i < s.length; i++) {
            if (res[s[i] - 97] == -1) {
                res[s[i] - 97] = i;
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}