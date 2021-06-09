package com.algorithm;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12985?language=java
 */

public class Algorithm2_32 {
    // A 2  B 7
// A 1  B 4
// A 1  B 2
    public static int solution(int n, int a, int b) {
        int answer = 1;

        while (true) {
            if ((a % 2 == 0 && a - 1 == b) || (a % 2 != 0 && a + 1 == b)) {
                break;
            }
            if (a % 2 != 0) {
                a = a + 1;
            }
            a /= 2;

            if (b % 2 != 0) {
                b = b + 1;
            }
            b /= 2;

            answer += 1;

            if (n < answer) break;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(8, 4, 7));
        System.out.println(solution(8, 1, 2));
        System.out.println(solution(8, 2, 3));
        System.out.println(solution(8, 4, 5));
    }
}

/*
    2  3
    1  2
 */
