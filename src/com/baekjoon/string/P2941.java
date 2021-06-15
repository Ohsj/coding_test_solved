package com.baekjoon.string;

/**
 * https://www.acmicpc.net/problem/2941
 */

import java.util.*;

public class P2941 {
    public static void main(String[] args) {
        String[] croa = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int idx = 0;
        while(croa.length > idx) {
            if (str.contains(croa[idx])) {
                str = str.replaceFirst(croa[idx], "0");
            } else {
                idx++;
            }
        }

        System.out.println(str.length());
    }
}
