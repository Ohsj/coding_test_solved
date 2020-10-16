package com.algorithm;

import java.util.Arrays;

public class Algorithm1_27 {
    public static int gcd(int max, int min) {
        while (min != 0) {
            int num = max % min;
            max = min;
            min = num;
        }
        return max;
    }

    public static int lcm(int max, int min) {
        return max * min / gcd(max, min);
    }

    public static int[] solution(int n, int m) {
         int max = Math.max(n, m);
         int min = Math.min(n, m);

        return new int[]{gcd(max, min), lcm(max, min)};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(2, 5)));
    }
}
