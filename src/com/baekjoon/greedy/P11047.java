package com.baekjoon.greedy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://www.acmicpc.net/problem/11047
 */

public class P11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int K = sc.nextInt();

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = sc.nextInt();
        }

        List<Integer> list = Arrays.stream(coins).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        int res = 0;
        int idx = 0;
        while(K > 0) {
            int coin = list.get(idx);
            res += K / coin;
            K %= coin;
            idx ++;
        }

        System.out.println(res);
    }
}
