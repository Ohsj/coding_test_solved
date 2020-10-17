package com.algorithm;

public class Algorithm1_33 {
    public static String solution(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }

    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
    }
}
