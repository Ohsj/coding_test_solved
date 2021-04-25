package com.kakao;

import java.util.*;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/72411
 */

public class BlindRecuitment2021_2 {

    static HashMap<String, Integer> map;
    static int m;

    public static String[] solution(String[] orders, int[] course) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        for (int i = 0; i < course.length; i++) {
            map = new HashMap<>();
            m = 0;
            for (int j = 0; j < orders.length; j++) {
                find(0,"",course[i], 0, orders[j]);
            }

            for (String key : map.keySet()) {
                if (map.get(key) == m && m > 1) {
                    pq.offer(key);
                }
            }
        }
        String[] answer = new String[pq.size()];
        int idx = 0;
        while(!pq.isEmpty()) {
            answer[idx++] = pq.poll();
        }

        return answer;
    }

    public static void find(int cnt, String str, int targetNum, int idx, String word) {
        if (cnt == targetNum) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String temps="";
            for (int i = 0; i < c.length; i++) temps += c[i];

            map.put(temps, map.getOrDefault(temps, 0)+1);
            m = Math.max(m, map.get(temps));
            return;
        }
        for (int i=idx; i<word.length();i++) {
            char now = word.charAt(i);
            find(cnt + 1, str + now, targetNum, i + 1, word);
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4})));
        System.out.println(Arrays.toString(solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2,3,5})));
        System.out.println(Arrays.toString(solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2,3,4})));
    }
}
