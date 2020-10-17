package programers;

import java.util.Arrays;

public class Algorithm1_37 {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            answer++;

            if (sum == budget) break;
            else if (sum > budget) {
                answer--;
                break;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,2,5,4}, 9));
        System.out.println(solution(new int[]{2,2,3,3}, 10));
    }
}
