package com.algorithm;

public class Algorithm1_40 {

    public static int solution(String dartResult) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        int tmp = 0;
        int before = 0;
        for (char ch : dartResult.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                if (sb.length() == 0) {
                    before = tmp;
                }
                sb.append(ch);
            } else if (ch == 'S') {
                tmp = Integer.parseInt(sb.toString());
                sb.setLength(0);
                answer += tmp;
            } else if (ch == 'D') {
                tmp = Integer.parseInt(sb.toString());
                sb.setLength(0);
                tmp = (int)Math.pow(tmp, 2);
                answer += tmp;
            } else if (ch == 'T') {
                tmp = Integer.parseInt(sb.toString());
                sb.setLength(0);
                tmp = (int)Math.pow(tmp, 3);
                answer += tmp;
            } else if (ch == '*') {
                answer = answer - before - tmp;
                tmp *= 2;
                answer = answer + (before * 2) + tmp;
            } else if (ch == '#') {
                tmp = -1 * tmp;
                answer = answer + tmp * 2;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
        System.out.println(solution("1D2S#10S"));
        System.out.println(solution("1D2S0T"));
        System.out.println(solution("1S*2T*3S"));
        System.out.println(solution("1D#2S*3S"));
        System.out.println(solution("1T2D3D#"));
        System.out.println(solution("1D2S3T*"));
    }
}
