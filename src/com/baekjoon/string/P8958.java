package com.baekjoon.string;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/8958
 */

public class P8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int res = 0;
            int score = 0;
            char[] str = sc.next().toCharArray();
            for (char item : str) {
                if (item == 'O') {
                    score++;
                    res+= score;
                } else if (item == 'X') {
                    score = 0;
                }
            }
            System.out.println(res);
        }
    }
}
