package com.algorithm;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Algorithm2_21 {
    static int[] arr = new int[1000001];
    public static int fibo(int n) {
        if (n < 2) {
            return arr[n];
        } else if (arr[n] != 0) {
            return arr[n];
        } else {
            for (int i = 2; i <= n; i++) {
                arr[i] = (fibo(i - 1) + fibo(i - 2)) % 1234567;
            }
            return arr[n];
        }
    }

    public static int solution(int n)
    {
        arr[1] = 1;
        return fibo(n);
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(5));
        System.out.println(solution(100000));
    }
}