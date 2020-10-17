package com.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Algorithm2_03 {

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Document> q = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            q.add(new Document(priorities[i], i));
        }
        Integer[] arr = Arrays.stream(priorities).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        int idx = 0;

        while(!q.isEmpty()) {
            if (idx == arr.length) {
                idx = 0;
            }

            Document cur = q.poll();
            if (cur.priority == arr[idx]) {
                answer++;
                idx++;
                if (cur.location == location) break;
            } else {
                q.add(cur);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }

    static class Document {
        int priority;
        int location;

        public Document(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }
    }
}
