package com.baekjoon.string;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/11721
 */

public class P11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int i = 0;
        while (true) {
            if (i + 10 >= str.length()) {
                System.out.println(str.substring(i));
                break;
            }
            i += 10;
            System.out.println(str.substring(i - 10, i));
        }
    }
}
