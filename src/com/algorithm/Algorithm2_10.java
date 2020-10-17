package programers;

import java.util.Arrays;

public class Algorithm2_10 {

    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int end = people.length - 1;
        int start = 0;

        while(end >= start) {
            int weight = people[end--];
            if (weight + people[start] <= limit) {
                start++;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{70,50,80,50}, 100));
        System.out.println(solution(new int[]{70,80,50}, 100));
    }
}
