package com.algorithm;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 프로그래머스 문자열 내림차순으로 배치하기
public class Algorithm1_13 {
    public static String solution(String s){
//        List<Integer> res = s.chars().boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//        char[] answer = new char[res.size()];
//        for (int i = 0 ; i < res.size(); i++) {
//            answer[i] = (char)res.get(i).intValue();
//        }
//        return String.valueOf(answer);

//        char [] ans = s.toCharArray();
//        Arrays.sort(ans);
//        return new StringBuilder(new String(ans)).reverse().toString();

        return Stream.of(s.split("")).sorted(Collections.reverseOrder()).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String ex1 = "Zbcdefg";
        System.out.println(solution(ex1));
    }
}
