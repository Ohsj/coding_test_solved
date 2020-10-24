package com.algorithm;

import java.util.*;

public class Algorithm2_20 {
    public static int[] solution(String s)
    {
        String[] strs = s.split("},");
        for (int i = 0; i < strs.length; i++) {
            strs[i] = strs[i].replaceAll("[^0-9,]", "");
        }

        Arrays.sort(strs, (o1, o2) -> o1.length() - o2.length());
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (String st : strs) {
            set.addAll(Arrays.asList(st.split(",")));
        }


        int[] answer = new int[set.size()];
        int idx = 0;
        for (String next : set) {
            answer[idx++] = Integer.parseInt(next);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
        System.out.println(Arrays.toString(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));
        System.out.println(Arrays.toString(solution("{{20,111},{111}}")));
        System.out.println(Arrays.toString(solution("{{123}}")));
        System.out.println(Arrays.toString(solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")));
    }
}