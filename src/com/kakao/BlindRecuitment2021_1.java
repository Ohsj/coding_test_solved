package com.kakao;

import java.util.Locale;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/72410?language=java
 */

public class BlindRecuitment2021_1 {

    public static String solution(String new_id) {
        String answer = new_id.toLowerCase();

        answer = answer.replaceAll("[^a-z0-9._-]","");

        answer = answer.replaceAll("[.]+", ".");

        answer = answer.replaceAll("^[.]|[.]$", "");

        if (answer.length() == 0) {
            answer = "a";
        }

        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }

        StringBuilder sb = new StringBuilder(answer);
        while(sb.length() <= 2) {
            char lastChar = answer.charAt(answer.length() - 1);
            sb.append(lastChar);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
//        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
//        System.out.println(solution("z-+.^."));
//        System.out.println(solution("=.="));
//        System.out.println(solution("123_.def"));
        System.out.println(solution("abcdefghijklmn.p"));
    }
}
