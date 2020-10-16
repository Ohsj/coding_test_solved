package com.algorithm;

// 프로그래머스 가운데 글자 가져오기
public class Algorithm1_07 {
    public static String solution(String s) {
        String answer;
        int half = s.length() / 2;
        if (s.length() % 2 == 0) {
            // 짝수
            String even = s.substring(half - 1, half + 1);
            answer = even;
        }else {
            // 홀수
            String add = s.substring(half, half+1);
            answer = add;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }
}
