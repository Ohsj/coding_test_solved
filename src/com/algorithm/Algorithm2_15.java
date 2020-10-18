package com.algorithm;

import java.util.*;

public class Algorithm2_15 {
    public static int solution(int[] scoville, int k){
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        for (int aScoville : scoville) {
            heap.offer(aScoville);
        }

        while (heap.peek() <= k) {
            if (heap.size() == 1) return -1;
            int a = heap.poll();
            int b = heap.poll();

            int res = a + (b * 2);

            heap.offer(res);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,9,10,12}, 7));
    }
}
