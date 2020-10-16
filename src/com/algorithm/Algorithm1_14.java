package com.algorithm;

// 프로그래머스 문자열 다루기 기본
public class Algorithm1_14 {

    public static boolean solution(String s){
        return (s.length() == 4 || s.length() == 6) && s.chars().filter(x -> x >= 48 && x <= 57).count() == s.length();
    }

    public static void main(String[] args) {
        System.out.println(solution("a234"));
        System.out.println(solution("1234"));
    }
}
