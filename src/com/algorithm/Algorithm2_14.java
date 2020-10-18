package com.algorithm;

public class Algorithm2_14 {
    public static int getMinIdxBalancedBracket(String p) {
        int cnt = 0;
        char[] brackets = p.toCharArray();
        int idx = 0;
        do {
            if (brackets[idx] == '(') {
                cnt ++;
            } else {
                cnt --;
            }
            idx++;
        } while(cnt != 0);
        return idx;
    }

    public static boolean isRightBracket(String u) {
        char[] brackets = u.toCharArray();
        int cnt = 0;
        for (char bracket : brackets) {
            if (bracket == '(') cnt++;
            else cnt--;

            if (cnt < 0) return false;
        }
        return true;
    }

    public static String loop(String p) {
        if (p.isEmpty()) return "";

        int idx = getMinIdxBalancedBracket(p);
        String u = p.substring(0, idx);
        String v = p.substring(idx);

        if (isRightBracket(u)) {
            u += loop(v);
            return u;
        } else {
            StringBuilder sb = new StringBuilder("(");
            sb.append(loop(v));
            sb.append(")");

            char[] tmp = u.substring(1, u.length() - 1).toCharArray();
            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i] == '(') tmp[i] = '(' + 1;
                else tmp[i] = ')' - 1;
                sb.append(tmp[i]);
            }
            return sb.toString();
        }
    }

    public static String solution(String p){
        return loop(p);
    }

    public static void main(String[] args) {
        System.out.println(solution("(()())()"));
        System.out.println(solution(")("));
        System.out.println(solution("()))((()"));
    }
}
