package com.algorithm;

public class Algorithm2_11 {

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String res = "";
        for (String s : skill_trees) {
            res = s.replaceAll("[^"+skill+"]","");
            if (skill.startsWith(res)) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));
    }
}
