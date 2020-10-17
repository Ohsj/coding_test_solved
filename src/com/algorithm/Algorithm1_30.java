package com.algorithm;

public class Algorithm1_30 {
    public static int solution(int num) {
        int answer = 0;
        long n = num;

        while(n != 1) {
            if (answer >= 500) return -1;
            answer++;
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
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
