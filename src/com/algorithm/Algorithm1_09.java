package com.algorithm;

import java.util.*;
import java.util.stream.Collectors;

// 프로그래머스 나누어 떨어지는 숫자 배열
public class Algorithm1_09 {
    public static int[] solution(int[] arr, int divisor) {
//        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        List<Integer> answerList = new ArrayList();
//        for (int i = 0; i < arrList.size(); i++) {
//            int tmp = arrList.get(i).intValue();
//            if (tmp % divisor == 0) {
//                answerList.add(tmp);
//            }
//        }
//
//        if (answerList.size() == 0) {
//            int[] val = new int[1];
//            val[0] = -1;
//            return val;
//        }
//
//        int[] answer = new int[answerList.size()];
//        for (int i = 0; i < answerList.size(); i++) {
//            answer[i] = answerList.get(i).intValue();
//        }
//
//        Arrays.sort(answer);
//
//        return answer;

        int[] res = Arrays.stream(arr).filter(x -> x % divisor == 0).sorted().toArray();
        if (res.length == 0) {
            res = new int[1];
            res[0] = -1;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] ex1 = {5,9,7,10};
        int[] ex2 = {2,36,1,3};
        int[] ex3 = {3,2,6};
        int d1 = 5, d2 = 1, d3 = 10;

        for (int i : solution(ex1, d1)) System.out.print(i+",");
        System.out.println();
        for (int i : solution(ex2, d2)) System.out.print(i+",");
        System.out.println();
        for (int i : solution(ex3, d3)) System.out.print(i+",");
        System.out.println();

    }
}
