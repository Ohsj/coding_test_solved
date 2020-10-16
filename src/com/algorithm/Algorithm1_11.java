package com.algorithm;

import java.util.Arrays;

// 프로그래머스 문자열 내 마음대로 정렬하기
public class Algorithm1_11 {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            String a = o1.substring(n, n+1);
            String b = o2.substring(n, n+1);

            int res;

            if (!a.equals(b)) {
                res = a.compareTo(b);
            }else {
                res = o1.compareTo(o2);
            }

            return res;
        });
        String [] answer = strings;
        return answer;
    }

    public static void main(String[] args) {
        String[] ex1 = {"sun", "bed", "car"}, ex2 = {"abce","abcd","cdx"};
        int n1 = 1, n2 = 2;
        Arrays.stream(solution(ex1, n1)).forEach(x -> System.out.print(x+", "));
        System.out.println();
        Arrays.stream(solution(ex2, n2)).forEach(x -> System.out.print(x+", "));
    }
}
