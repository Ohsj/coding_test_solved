package com.algorithm;

public class Algorithm2_16 {
    static int cnt = 0;

    public static void dfs(int[] numbers, int target, int depth, int sum) {
        if (depth >= numbers.length) {
            if (sum == target) cnt++;
            return;
        }

        dfs(numbers, target, depth+1, sum + numbers[depth]);
        dfs(numbers, target, depth+1, sum - numbers[depth]);

    }

    public static int solution(int[] numbers, int target){
        dfs(numbers, target, 0, 0);
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,1,1,1}, 3));
    }
}
