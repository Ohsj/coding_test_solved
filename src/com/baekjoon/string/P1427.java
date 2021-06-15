package com.baekjoon.string;

/**
 * https://www.acmicpc.net/problem/1427
 */
import java.util.*;

public class P1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Character[] arr = new Character[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (char tmp : arr) {
            sb.append(tmp);
        }
        System.out.println(sb);
    }
}
