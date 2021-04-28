package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/1715
 */

public class P1715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Long> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.offer(sc.nextLong());
        }

        long res = 0;
        while(queue.size() > 1) {
            long tmp1 = queue.poll();
            long tmp2 = queue.poll();

            res += tmp1 + tmp2;
            queue.add(tmp1 + tmp2);
        }
        System.out.println(res);
    }
}
/*
    10 20 30 40
    (10 + 20) + (30 + 30) + (60 + 40) = 190
    (10 + 30) + (40 + 20) + (60 + 40) = 200
    (10 + 40) + (50 + 20) + (70 + 30) = 220
 */