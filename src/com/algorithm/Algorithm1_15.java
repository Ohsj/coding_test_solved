package com.algorithm;

import java.util.*;

// 프로그래머스 서울에서 김서방 찾기
public class Algorithm1_15 {
    public static String solution(String[] seoul) {
        int answer = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + answer +"에 있다";
    }

    public static void main(String[] args) {
        String[] ex1 = {"Jane", "Kim"};
        System.out.println(solution(ex1));
    }
}
