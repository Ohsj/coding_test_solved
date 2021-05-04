package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/1439
 */

public class P1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int z = 0;
        int o = 0;

        if (s[0] == '0') z++;
        else o++;

        for(int i = 1; i < s.length; i++) {
            if (s[i-1] != s[i]) {
                if (s[i] == '0') z++;
                else o++;
            }
        }

        System.out.println(Math.min(z, o));
    }
}
