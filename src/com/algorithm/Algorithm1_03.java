package com.algorithm;

import java.util.*;

// 프로그래머스 완주하지 못한 선수
public class Algorithm1_03 {

    // 정확성 모두 통과 / 효율성 모두 실패 (50/100)
    public static String solution1(String[] participant, String[] completion) {

        ArrayList<String> participantList = new ArrayList(Arrays.asList(participant));

        for(int i = 0; i < completion.length; i++) {
            if (participantList.contains(completion[i])) {
                participantList.remove(completion[i]);
            }
        }

        String answer = participantList.get(0);
        return answer;
    }

    // 정확성, 효율성 모두 통과
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> participantMap = new HashMap();

        for (int i = 0; i < participant.length; i++) {
            participantMap.put(participant[i], participantMap.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            participantMap.put(completion[i], participantMap.get(completion[i]) - 1);
        }

        for (Map.Entry m : participantMap.entrySet()) {
            if ((int)m.getValue() > 0) {
                answer = (String) m.getKey();
                break;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        String[] ex1 = {"leo", "kiki", "eden"};
        String[] ex1Com = {"eden", "kiki"};
        System.out.println(solution(ex1, ex1Com));

        String[] ex2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] ex2Com = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(ex2, ex2Com));
//        		vinko

        String[] ex3 = {"mislav", "stanko", "mislav", "ana"};
        String[] ex3Com = {"stanko", "ana", "mislav"};
        System.out.println(solution(ex3, ex3Com));

    }
}
