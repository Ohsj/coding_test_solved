package com.algorithm;

import java.util.*;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/12973
 */

public class Algorithm2_30 {
    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        int idx = 1;
        while(idx < s.length()) {
            Character cur = s.charAt(idx);
            if (stack.isEmpty()) {
                stack.push(cur);
            } else {
                Character tmp = stack.peek();

                if (tmp != cur) {
                    stack.push(cur);
                } else {
                    stack.pop();
                }
            }
            idx++;
        }
        return stack.size() == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
        System.out.println(solution("cdcd"));
    }
}
