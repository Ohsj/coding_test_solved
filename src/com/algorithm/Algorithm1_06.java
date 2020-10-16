package com.algorithm;

// 프로그래머스 2016년
public class Algorithm1_06 {
    public static String solution(int a, int b) {
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};

        String[] dates = {"FRI", "SAT","SUN", "MON", "TUE", "WED", "THU"};

        int sumOfDay = 0;
        for (int i = 0; i < a - 1; i ++) {
            sumOfDay += days[i];
        }
        sumOfDay += b-1;


        String answer = dates[sumOfDay % dates.length];
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1,1));
    }
}
