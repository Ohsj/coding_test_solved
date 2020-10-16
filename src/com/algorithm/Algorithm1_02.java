package com.algorithm;

import java.util.*;

// 프로그래머스 모의고사
public class Algorithm1_02 {
    public static int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int aCnt = 0, bCnt = 0, cCnt = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length])
                aCnt++;

            if (answers[i] == b[i % b.length])
                bCnt++;

            if (answers[i] == c[i % c.length])
                cCnt++;
        }

        int max = Math.max(Math.max(aCnt, bCnt), cCnt);

        List<Integer> ans = new ArrayList();
        if (aCnt == max) ans.add(1);
        if (bCnt == max) ans.add(2);
        if (cCnt == max) ans.add(3);

        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] ex1 = {1,2,3,4,5};
        System.out.println(solution(ex1));

        int[] ex2 = {1,3,2,4,2};
        System.out.println(solution(ex2));
    }
}
