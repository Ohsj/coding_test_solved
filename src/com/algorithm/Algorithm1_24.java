package com.algorithm;

import java.util.Arrays;
import java.util.Collections;

public class Algorithm1_24 {
    public static long solution(long n) {
        String[] numArr = Long.toString(n).split("");
        Arrays.sort(numArr, Collections.reverseOrder());
        String str = String.join("", numArr);
        return Long.parseLong(str);
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
