package com.baekjoon.string;

/**
 * https://www.acmicpc.net/problem/1181
 */

import java.util.*;

public class P1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String tmp = sc.next();
            if (!list.contains(tmp)) {
                list.add(tmp);
            }
        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() < s2.length()) {
                    return -1;
                } else if (s1.length() == s2.length()){
                    return s1.compareTo(s2);
                } else {
                    return 1;
                }
            }
        });

        for (String str : list) {
            System.out.println(str);
        }

    }
}
