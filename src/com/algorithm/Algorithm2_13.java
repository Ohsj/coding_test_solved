package com.algorithm;

public class Algorithm2_13 {
    public static String getSplitedLength(String s, int n, int repeat) {
        if (s.length() < n) return s;
        String result = "";
        String preStr = s.substring(0, n);
        String postStr = s.substring(n);

        if (!postStr.startsWith(preStr)) {
            if (repeat == 1){
                result += preStr + getSplitedLength(postStr, n, 1);
                return result;
            }
            result += repeat + preStr + getSplitedLength(postStr, n, 1);
            return result;
        }

        result += getSplitedLength(postStr, n, repeat + 1);
        return result;
    }

    public static int solution(String s){
        int answer = 0;
        for (int i = 1; i < (s.length() / 2) + 1; i++) {
            String result = getSplitedLength(s, i, 1);
            answer = i == 1 ? result.length() : Math.min(answer, result.length());
        }
        return answer;
    }

//    public static int solution(String s) {
//        StringBuilder sb = new StringBuilder();
//        int answer = s.length();
//        String str;
//        int cnt;
//        int j;
//        for (int i = 1; i < s.length() / 2 + 1; i++) {
//            str = s.substring(0, i);
//            sb.setLength(0);
//            cnt = 0;
//            for (j = 0; j < s.length(); j = j + i) {
//                String curStr;
//                if (j+i > s.length()) {
//                    sb.append(s.substring(j));
//                    continue;
//                }
//                curStr = s.substring(j, j+i);
//                if (!str.equals(curStr)) {
//                    if (cnt > 1) {
//                        sb.append(cnt).append(str);
//                    } else {
//                        sb.append(str);
//                    }
//                    cnt = 1;
//                    str = curStr;
//                } else {
//                    cnt++;
//                }
//            }
//
//            if (cnt > 1) {
//                sb.append(cnt).append(str);
//            } else {
//                sb.append(str);
//            }
//
//            if (answer > sb.length()) {
//                answer = sb.length();
//            }
//        }
//        return answer;
//    }

    public static void main(String[] args) {
        System.out.println(solution("aabbaccc"));
        System.out.println(solution("ababcdcdababcdcd"));
        System.out.println(solution("abcabceded"));
        System.out.println(solution("abcabcabcabcdededededede"));
        System.out.println(solution("xababcdcdababcdcd"));
    }
}
