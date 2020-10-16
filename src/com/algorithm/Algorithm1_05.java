package com.algorithm;

import java.util.*;

// 프로그래머스 체육복
public class Algorithm1_05 {

    public static int soultion(int n, int[] lost, int[] reserve) {

        // 체육복 보유 갯수
        int[] cntArr = new int[n];

        for (int i = 0; i < n; i++) {
            // 모두 한벌씩 가지고 있다.
            cntArr[i] += 1;
            int j = i;
            // 여분을 가지고 왔다.
            if (Arrays.stream(reserve).anyMatch(x -> x == j + 1))
                cntArr[i] += 1;
            // 도난을 당했다.
            if (Arrays.stream(lost).anyMatch(x -> x == j + 1))
                cntArr[i] -= 1;
         }

        for (int i = 0; i < n; i++) {
            if(i > 0 && cntArr[i] == 0 && cntArr[i-1] == 2) {
                cntArr[i] += 1;
                cntArr[i-1] -= 1;
            } else if (i < n - 1 && cntArr[i] == 0 && cntArr[i+1] == 2) {
                cntArr[i] += 1;
                cntArr[i+1] -= 1;
            }
        }

        int answer = (int) Arrays.stream(cntArr).filter(x -> x > 0).count();
        return answer;
    }

    public static void main(String[] args) {
        int ex1 = 5, ex2 = 5, ex3 = 3;
        int[] lost1 = {2,4}, lost2 = {2,4}, lost3 = {3};
        int[] reserve1 = {1,3,5}, reserve2 = {3}, reserve3 = {1};

        System.out.println(soultion(ex1, lost1, reserve1)); // 5
        System.out.println(soultion(ex2, lost2, reserve2)); // 4
        System.out.println(soultion(ex3, lost3, reserve3)); // 2
    }
}
