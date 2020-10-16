package com.algorithm;

public class Algorithm1_25 {
    public static long solution(long n) {
        double num = Math.sqrt(n);
        long answer;
        if (num % 1 != 0) {
            answer = -1;
        } else {
            answer = (long)Math.pow(num + 1, 2);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(121));
        System.out.println(solution(144));
        System.out.println(solution(3));
    }
}
