package programers;

import java.util.*;

public class Algorithm2_01 {

    public static int[] solution(int[] prices) {
        List<Integer> list = new ArrayList<>();
        int cnt;
        for (int i = 0; i < prices.length; i++) {
            cnt = 0;
            for (int j = i + 1; j < prices.length; j++) {
                cnt++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            list.add(cnt);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,2,3})));
    }
}
