package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/16953
 */

public class P16953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = 0;

        while(true) {

            if (a == b) {
                System.out.println(res + 1);
                return;
            }  else if (a > b) {
                System.out.println(-1);
                return;
            }

            if (b % 2 == 0) {
                b /= 2;
            } else {
                if (b % 10 == 1) {
                    b /= 10;
                } else {
                    System.out.println(-1);
                    return;
                }
            }
            res++;
        }
    }
}

/*
162 -> 81 -> 8 -> 4 -> 2
42 -> 21 -> 2
40021 -> 4002 -> 2001 -> 200 -> 100
 */