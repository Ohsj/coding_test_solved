package com.algorithm;

import java.util.Arrays;

public class Algorithm2_26 {
    public static String solution(String s)
    {
        char[] chars = s.toLowerCase().toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 2; i<chars.length; i++) {
            if (chars[i-1] == ' '){
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
        System.out.println(solution("for the last week"));
    }
}