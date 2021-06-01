package com.algorithm;

import java.util.*;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/1845
 */

public class Algorithm1_45 {
    public static int solution(int[] nums) {
        int kind = 1;
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i -1] != nums[i]) kind++;
        }
        return Math.min(kind, nums.length / 2);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,3}));
        System.out.println(solution(new int[]{3,3,3,2,2,4}));
        System.out.println(solution(new int[]{3,3,3,2,2,2}));
    }
}