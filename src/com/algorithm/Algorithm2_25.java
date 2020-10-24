package com.algorithm;

public class Algorithm2_25 {
    public static int gcd(int a, int b) {
        while(b!=0) {
            int r = a % b;
            a=b;
            b=r;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a*b/gcd(a,b);
    }

    public static int solution(int[] n)
    {
        int answer = n[0];
        for (int i = 1; i < n.length; i++) {
            answer = lcm(answer, n[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,6,8,14}));
        System.out.println(solution(new int[]{1,2,3}));
    }
}