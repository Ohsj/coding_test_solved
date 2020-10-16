package com.algorithm;


// 프로그래머스 문자열 내 p와 y의 개수
public class Algorithm1_12 {
    public static boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        s = s.toLowerCase();

        for (char ch : s.toCharArray()) {
            if (ch == 'p') pCnt += 1;
            if (ch == 'y') yCnt += 1;
        }
        return pCnt == yCnt;

//        s = s.toLowerCase();
//        return s.chars().filter(e -> 'p' == e).count() == s.chars().filter(e -> 'y' == e).count();
    }

    public static void main(String[] args) {
        String ex1 = "pPoooyY", ex2 = "Pyy";
        System.out.println(solution(ex1));
        System.out.println(solution(ex2));
    }
}
