package com.kakao;

public class Internship1 {
    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int l = 10, r = 12;
        for (int number : numbers) {
            if (number == 0) number = 11;
            if (number == 1 || number == 4 || number == 7) {
                l = number;
                sb.append("L");
            } else if (number == 3 || number == 6 || number == 9) {
                r = number;
                sb.append("R");
            } else {
                int[] lxy = {l/3 , l%3};
                int[] rxy = {r/3 , r%3};
                int[] num = {number/3, number%3};

                if (lxy[1] == 0) {
                    lxy[0] = lxy[0] - 1;
                    lxy[1] = 3;
                }

                if (rxy[1] == 0) {
                    rxy[0] = rxy[0] - 1;
                    rxy[1] = 3;
                }

                int lDist = Math.abs(lxy[0] - num[0]) + Math.abs(lxy[1] - num[1]);
                int rDist = Math.abs(rxy[0] - num[0]) + Math.abs(rxy[1] - num[1]);

                if (lDist > rDist) {
                    sb.append("R");
                    r = number;
                } else if (lDist < rDist) {
                    sb.append("L");
                    l = number;
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        l = number;
                    } else {
                        sb.append("R");
                        r = number;
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] sample1 = {1,3,4,5,8,2,1,4,5,9,5};
        String hand1 = "right";
        int[] sample2 = {7,0,8,2,8,3,1,5,7,6,2};
        String hand2 = "left";
        int[] sample3 = {1,2,3,4,5,6,7,8,9,0};
        String hand3 = "right";
        System.out.println(solution(sample1, hand1));
        System.out.println("LRLLLRLLRRL");

        System.out.println();

        System.out.println(solution(sample2, hand2));
        System.out.println("LRLLRRLLLRR");

        System.out.println();

        System.out.println(solution(sample3, hand3));
        System.out.println("LLRLLRLLRL");
    }
}
