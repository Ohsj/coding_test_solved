package com.baekjoon.string;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/2577
 */

public class P2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] num = new int[10];
        char[] mul = Integer.toString(a * b * c).toCharArray();
        for (char item : mul) {
            int idx = Character.digit(item, 10);
            num[idx]++;
        }

        for (int i : num) {
            System.out.println(i);
        }

    }
}
