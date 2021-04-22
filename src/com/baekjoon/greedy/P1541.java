package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/1541
 */

public class P1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] exp = sc.nextLine().split("-");
        int sum = 0;
        boolean isFirst = true;

        for (String s : exp) {
            int tmp = 0;

            String[] add = s.split("\\+");

            for (String value : add) {
                tmp += Integer.parseInt(value);
            }

            if (isFirst) {
                sum = tmp;
                isFirst = false;
            } else {
                sum -= tmp;
            }
        }

        System.out.println(sum);
    }
}
