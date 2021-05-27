package com.baekjoon.string;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/1110
 */

public class P1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if (n.length() < 2) {
            n = "0" + n;
        }

        StringBuilder sb = new StringBuilder(n);


        int res = 0;
        if (n.equals("0")) {
            System.out.println(1);
            return;
        }

        do {
            if (sb.length() < 2) {
                sb.insert(0, '0');
            }

            int num1 = Integer.parseInt(sb.substring(0, 1));
            int num2 = Integer.parseInt(sb.substring(1));

            sb.setLength(0);
            sb.append(num2);
            sb.append((num1 + num2) % 10);
            res++;
        }while(!sb.toString().equals(n));

        System.out.println(res);
    }
}