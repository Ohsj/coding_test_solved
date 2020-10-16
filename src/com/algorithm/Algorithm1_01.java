package com.algorithm;

import java.util.*;

// 프로그래머스 크레인 인형뽑기 게임
public class Algorithm1_01 {

    // 보드 배열 크기는 5 이상 30 이하
    // moves 배열 크기는 1이상 1000이하
    public static int solution(int[][] board, int[] moves) {
        List<Integer> stack = new ArrayList();

        int answer = 0;

        int outerLen = moves.length;
        int innerLen = board.length;
        for (int i = 0; i < outerLen; i++) {
            for (int j = 0; j < innerLen; j++) {
                int doll = board[j][moves[i] - 1];
                // 0이면 다음칸
                if (doll == 0) continue;

                // 인형을 꺼낸다.
                board[j][moves[i] - 1] = 0;

                if (!stack.isEmpty()) {
                    // 스택이 비어있지 않을 때
                    int topIdx = stack.size() - 1;
                    int top = stack.get(topIdx);
                    if (top == doll) {
                        stack.remove(topIdx);
                        // 사라진 인형 개수 추가
                        answer += 2;
                    }else {
                        stack.add(doll);
                    }
                }else {
                    // 스택이 비어있을 때
                    stack.add(doll);
                }
                break;
            }// inner for
        } // outer for

        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board, moves));
    }
}
