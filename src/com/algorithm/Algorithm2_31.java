package com.algorithm;

import java.util.ArrayList;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/1835
 */

public class Algorithm2_31 {
    static String[] arr = {"A", "C", "F", "J", "M", "N", "R", "T"};
    static ArrayList<String> res = new ArrayList<>();

    public static void check(String out, String[] data) {
        int cnt = 0;
        for (String s : data) {
            int position1 = out.indexOf(s.substring(0, 1));
            int position2 = out.indexOf(s.substring(2, 3));
            int abs = Math.abs(position1 - position2) - 1;

            int gap = Integer.parseInt(s.substring(4));

            char oper = s.charAt(3);
            if(oper == '=') {
                if (abs == gap) cnt++;
                else return;
            } else if (oper == '>') {
                if (abs > gap) cnt++;
                else return;
            } else if (oper == '<') {
                if (abs < gap) cnt++;
                else return;
            } else {
                return;
            }
        }
        if (cnt == data.length) res.add(out);
    }

    public static void perm(String[] arr, String out, boolean[] visit, int depth, int n, int r, String[] data) {
        if (depth == r) {
            check(out, data);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                out += arr[i];
                perm(arr, out, visit, depth + 1, n, r, data);
                out = out.substring(0, out.length() - 1);
                visit[i] = false;
            }
        }
    }

    public static int solution(int n, String[] data) {
        boolean[] visit = new boolean[8];
        res.clear();
        perm(arr, "", visit, 0, 8, 8, data);
        return res.size();
    }

    public static void main(String[] args) {
        System.out.println(solution(2, new String[]{"N~F=0", "R~T>2"}));
        System.out.println(solution(2, new String[]{"M~C<2", "C~M>1"}));
    }
}
