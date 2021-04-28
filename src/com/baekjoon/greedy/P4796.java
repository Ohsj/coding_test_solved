package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/4796
 */

public class P4796 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l;
        int p;
        int v;
        int idx = 1;
        while(true) {
            l = sc.nextInt();
            p = sc.nextInt();
            v = sc.nextInt();

            if (l == 0 && p == 0 && v == 0) {
                break;
            }

            int res = (v / p) * l + Math.min(v % p, l);
            System.out.println("Case " + idx++ + ": " + res);
        }
    }
}

/*
8 ,5, 20

0 0 0 0 0 0 0 0
1 1 1 1 1
0 0 0 0 0 0 0 0
1 1 1 1 1
0 0 0 0 0 0
1 1 1 1 1
 */