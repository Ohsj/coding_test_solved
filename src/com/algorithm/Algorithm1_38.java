package com.algorithm;

import java.util.Arrays;

public class Algorithm1_38 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String cvt = Integer.toBinaryString(arr1[i] | arr2[i]);
            int len = cvt.length();
            if (len != n) {
                StringBuilder tmp = new StringBuilder();
                tmp.append("0".repeat(Math.max(0, n - len)));
                cvt = tmp + cvt;
            }
            answer[i] = cvt.replaceAll("1", "#").replaceAll("0", " ");
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
        System.out.println(Arrays.toString(solution(6, new int[]{46,33,33,22,31,50}, new int[]{27,56,19,14,14,10})));
    }
}
