package com.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Algorithm2_04 {

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int curWeight = 0;

        for (int t : truck_weights) {
            while (true) {
                if (q.isEmpty()) {
                    q.add(t);
                    curWeight += t;
                    answer++;
                    break;
                } else if (q.size() == bridge_length) {
                    curWeight -= q.poll();
                } else {
                    if (curWeight + t > weight) {
                        q.add(0);
                        answer++;
                    } else {
                        q.add(t);
                        curWeight += t;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer + bridge_length;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 10, new int[]{7,4,5,6}));
        System.out.println(solution(100, 100, new int[]{10}));
        System.out.println(solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10}));
    }
}
