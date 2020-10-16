package com.algorithm;

// 프로그래머스 시저 암호
public class Algorithm1_19 {
    public static String solution(String s, int n) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ((ch >= 65 && ch <= 90)) {
                chars[i] = (char)(ch + n);
                if (chars[i] > 90) {
                    chars[i] = (char)(chars[i] - 26);
                }
            }else if ((ch >= 97 && ch <= 122)){
                chars[i] = (char)(ch + n);
                if (chars[i] > 122) {
                    chars[i] = (char)(chars[i] - 26);
                }
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String ex1 = "AB", ex2 = "z", ex3 = "a B z";
        int n1 = 1, n2 = 1, n3 = 4;
        System.out.println(solution(ex1, n1));
        System.out.println(solution(ex2, n2));
        System.out.println(solution(ex3, n3));
    }
}
