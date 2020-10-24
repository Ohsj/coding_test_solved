package com.algorithm;

public class Algorithm2_24 {
    // 연속된 수의 합이 n인 경우는 n의 약수의 홀수 갯수와 동일(정수론)
    public static int solution1(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 1) {
                answer ++;
            }
        }
        return answer;
    }

    public static int solution(int n)
    {
        int answer = 0;
        int sum;
        for (int i = 1; i <= n; i++) {
            sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum > n) break;
                if (sum == n) {
                    answer++;
                    break;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println(solution(10000));
        System.out.println(solution1(15));
        System.out.println(solution1(10000));
    }
}