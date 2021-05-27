package com.baekjoon.string;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/1152
 */

public class P1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().trim();
        sc.close();

        if (sentence.length() == 0) {
            System.out.println(0);
        } else {
            String[] words = sentence.split(" ");
            System.out.println(words.length);
        }

    }
}