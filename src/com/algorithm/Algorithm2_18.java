package com.algorithm;

public class Algorithm2_18 {
    public static boolean solution(String s)
    {
        int cnt = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') cnt++;
            else cnt--;
            if (cnt < 0) return false;
        }

        return cnt == 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));
    }
}