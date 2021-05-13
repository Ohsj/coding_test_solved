package com.baekjoon.greedy;

import java.util.*;

public class P13904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Task[] t = new Task[n];

        for (int i = 0; i < n; i++) {
            t[i] = new Task();
            t[i].d = sc.nextInt();
            t[i].w = sc.nextInt();
        }

        Arrays.sort(t);

        int res = 0;
        Task[] seq = new Task[1001];

        for (int i = 1; i <= n; i++) {
            Task tmp = t[i - 1];
            int idx = tmp.d;
            while (idx >= 1) {
                if (seq[idx] == null) {
                    break;
                }
                idx--;
            }
            if (idx != 0) {
                seq[idx] = tmp;
                res += tmp.w;
            }

        }
        System.out.println(res);
    }
}

class Task implements Comparable<Task> {
    int d;
    int w;

    @Override
    public int compareTo(Task o1) {
        return Integer.compare(o1.w, w);
    }

    @Override
    public String toString() {
        return "[" + d + ", " + w + "]";
    }
}
