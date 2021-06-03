package com.algorithm;

import java.util.*;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42888?language=java
 */

public class Algorithm2_29 {
    public static String[] solution(String[] record) {
        Map<String, String> user = new HashMap<>();
        for (String log : record) {
            String[] infos = log.split(" ");
            if (infos[0].equals("Enter") || infos[0].equals("Change")) {
                user.put(infos[1], infos[2]);
            }
        }

        ArrayList<String> answer = new ArrayList<>();
        for (String s : record) {
            String[] infos = s.split(" ");
            if (infos[0].equals("Change")) {
                continue;
            }
            String name = user.get(infos[1]);
            String ctn = infos[0].equals("Enter") ? "님이 들어왔습니다." : "님이 나갔습니다.";
            answer.add(name + ctn);
        }

        return answer.toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"})));
    }
}
