package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithm2_02 {

    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int tmp = 0;
        while(n > 0) {
            tmp = n % 3;
            n /= 3;
            if (tmp == 0) {
                tmp = 4;
                n -= 1;
            }
            sb.append(tmp);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
    }
}
