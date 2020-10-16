package com.algorithm;

import java.util.*;

// 프로그래머스 k번째 수
public class Algorithm1_04 {
    public static int[] solution(int[] array, int[][] commands) {

        List<Integer> answerList = new ArrayList();

        for (int i = 0; i < commands.length; i++) {
            List<Integer> tmp = new ArrayList();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                tmp.add(array[j]);
            }
            Collections.sort(tmp);
            answerList.add(tmp.get(commands[i][2] - 1));
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;

        // 다른 사람이 푼 문제 (알게 된 것 Arrays.copyOfRange)
//        int[] answer = new int[commands.length];
//        for (int i = 0; i < commands.length; i++) {
//            int[] tmp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
//            Arrays.sort(tmp);
//            answer[i] = tmp[commands[i][2] - 1];
//        }
//        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};

        int[] res = solution(array, commands);
        for (int item : res) {
            System.out.println(item);
        }
    }
}
