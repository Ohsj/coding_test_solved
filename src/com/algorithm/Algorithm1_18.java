package com.algorithm;

// 프로그래머스 소수 찾기
public class Algorithm1_18 {
    public static int solution(int n) {
        // 에라토스테네스의 체
        boolean[] isPrimary = new boolean[n+1];
        for (int i = 2; i <= n; i++) isPrimary[i] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrimary[i]) {
                for (int j = i; j * i < n; j++) {
                    isPrimary[i*j] = false;
                }
            }
        }

        int answer = 0;
        for (int i = 2; i <= n; i++)
            if(isPrimary[i]) answer+=1;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
        System.out.println(solution(10));
    }
}
