package com.baekjoon.string;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/1157
 */

public class P1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        int[] alpha = new int[26];
        int max = -1;
        char res = '?';
        for (char ch : str.toCharArray()) {
            alpha[ch - 65] += 1;
            if (alpha[ch - 65] > max) {
                max = alpha[ch - 65];
                res = ch;
            } else if (alpha[ch - 65] == max){
                res = '?';
            }
        }
        System.out.println(res);
    }
}
