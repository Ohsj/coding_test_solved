package com.algorithm;

import java.util.*;

// 프로그래머스 같은 숫자는 싫어
public class Algorithm1_08 {
    public static int[] solution(int[] arr) {
        List<Integer> answerList = new ArrayList();
        int val = arr[0];
        answerList.add(val);

        for (int i = 1; i < arr.length; i++) {
             if (!(val == arr[i])) {
                 val = arr[i];
                 answerList.add(val);
             }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i).intValue();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] ex1 = {1,1,3,3,0,1,1};
        int[] ex2 = {4,4,4,3,3};
        for (int i : solution(ex1)) System.out.print(i);
        System.out.println();
        for (int i : solution(ex2)) System.out.print(i);
    }
}
