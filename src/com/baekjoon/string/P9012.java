package com.baekjoon.string;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/9012
 */

public class P9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String answer = "YES";
            int cnt = 0;
            String str = sc.next();
            for (Character ch : str.toCharArray()) {
                if (ch == '(') {
                    cnt ++;
                } else {
                    cnt --;
                    if (cnt < 0) {
                        answer = "NO";
                        break;
                    }
                }
            }
            if (cnt != 0) answer = "NO";
            System.out.println(answer);
        }
    }
}
