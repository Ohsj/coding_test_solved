package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/1339
 */

public class P1339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] arr = new String[N];
        int[] alpha = new int[26];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        // 알파벳의 갯수를 세고
        for (String s : arr) {
            int tmp = (int) Math.pow(10, s.length()-1);
            for (int j = 0; j < s.length(); j++) {
                char cur = s.charAt(j);
                alpha[(int) cur - 65] += tmp;
                tmp /= 10;
            }
        }

        // 갯수 대로 정렬 후
        Arrays.sort(alpha);

        int idx = 9;
        int sum = 0;
        // 가장 큰수 부터 9를 곱해가며 내려온다.
        for (int i = alpha.length - 1; i >= 0; i--) {
            sum += alpha[i] * idx;
            idx--;
        }
        System.out.println(sum);
    }
}
