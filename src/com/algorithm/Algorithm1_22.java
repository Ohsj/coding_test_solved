package com.algorithm;

public class Algorithm1_22 {
    public static int solution(int n) {
        int answer = 0;
        int val = n;

        while(val > 0) {
            answer += val % 10;
            val /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(987));
    }
}
