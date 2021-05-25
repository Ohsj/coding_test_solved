package com.baekjoon.greedy;

import java.util.*;
/**
 * https://www.acmicpc.net/problem/13413
 *
 *
 * W와 B가 목표와 다른 것들의 갯수 각각 세서 짝을 지어주고(서로 위치를 바꿈) 남은건 더해준다.(뒤집기)
 */

public class P13413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            char[] cur = sc.next().toCharArray();
            char[] goal = sc.next().toCharArray();

            int w = 0;
            int b = 0;
            for (int j = 0; j < n ; j++) {
                if (cur[j] != goal[j]) {
                    if (cur[j] == 'W') w++;
                    else b++;
                }
            }

            int res = Math.abs(w-b) + Math.min(w, b);
            System.out.println(res);
        }
    }
}
