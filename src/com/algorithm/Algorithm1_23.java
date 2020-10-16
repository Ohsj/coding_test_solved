package com.algorithm;

import java.util.Arrays;

public class Algorithm1_23 {
    public static int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        String str = sb.reverse().toString();
        return Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }
}

