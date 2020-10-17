package com.algorithm;

import java.util.Arrays;

public class Algorithm1_39 {
    public static int[] solution(int N, int[] stages) {
        int[] tmp = new int[N+1];

        for (int stage : stages) {
            if (stage != N + 1)
                tmp[stage]++;
        }

        int total = stages.length;
        Fail[] fails = new Fail[N+1];
        fails[0] = new Fail(1000, -1);
        for (int i = 1; i < tmp.length; i++) {
            if (total == 0) {
                fails[i] = new Fail(i, 0);
            } else {
                fails[i] = new Fail(i ,(double)tmp[i] / total);
                total -= tmp[i];
            }
        }

        Arrays.sort(fails, (o1, o2) -> {
            if (o1.rate != o2.rate) {
                return -Double.compare(o1.rate, o2.rate);
            }
            return o1.num - o2.num;
        });

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = fails[i].num;
        }

        return answer;
    }

    static class Fail {
        int num;
        double rate;
        Fail(int num, double rate) {
            this.num = num;
            this.rate = rate;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
        System.out.println(Arrays.toString(solution(4, new int[]{4, 4, 4, 4, 4})));
    }
}
