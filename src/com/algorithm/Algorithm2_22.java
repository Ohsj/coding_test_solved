package com.algorithm;

import java.util.Arrays;

public class Algorithm2_22 {
    public static String solution(String s)
    {
        String[] numbers = s.split(" ");
        int[] cvtNums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            cvtNums[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(cvtNums);
        return cvtNums[0] + " " + cvtNums[numbers.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
        System.out.println(solution("-1 -2 -3 -4"));
        System.out.println(solution("-1 -1"));
    }
}