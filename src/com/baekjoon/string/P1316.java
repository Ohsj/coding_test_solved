package com.baekjoon.string;

/**
 * https://www.acmicpc.net/problem/1316
 */

import java.util.*;

public class P1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();

            int[] alpha = new int[26];
            char[] arr = str.toCharArray();
            alpha[arr[0] - 'a'] = 1;

            boolean isgrp = true;

            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] == arr[j]) {
                    alpha[arr[j] - 'a'] ++;
                } else {
                    if (alpha[arr[j] - 'a'] != 0) {
                        isgrp = false;
                        break;
                    } else {
                        alpha[arr[j] - 'a']++;
                    }
                }
            }

            if (isgrp) {
                res++;
            }
        }
        System.out.println(res);
    }
}
