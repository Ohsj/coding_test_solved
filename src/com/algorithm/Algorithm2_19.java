package com.algorithm;

public class Algorithm2_19 {
    public static int solution(int n)
    {
        int cnt = Integer.bitCount(n);
        int answer = n + 1;
        while(cnt != Integer.bitCount(answer))
            answer++;

        return answer;
    }

    // 1001110
    // 1010011
    // 1011110

    public static void main(String[] args) {
        System.out.println(solution(78));
        System.out.println(solution(15));
    }
}