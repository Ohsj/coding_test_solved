package com.algorithm;

public class Algorithm1_29 {
    public static int solution(int num) {
        int answer = 0;

        while(true) {
            if (num == 1) break;
            if (answer > 500) {
                answer = -1;
                break;
            }

            answer++;
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));

    }
}
