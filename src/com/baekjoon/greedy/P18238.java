package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/18238
 */

public class P18238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();

        int ans = 0;
        char cur = 'A';

        for (char ch : str) {
            int a = ch - cur;
            int b = cur - ch;
            if (a < 0) a += 26;
            if (b < 0) b += 26;
            ans += Math.min(a, b);
            cur = ch;
        }

        System.out.println(ans);
    }
}
/*
    A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
    65     90  -25 + 26
    'Z' -> 'A' = 1
    90     65   25
    'A' -> 'Z' = 25
    71      80  -9 + 26 = 17
    'P' -> 'G' = 17
     80     71  9
    'G' -> 'P' = 9
 */