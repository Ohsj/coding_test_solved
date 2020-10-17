package programers;

import java.util.Arrays;

public class Algorithm1_34 {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int N1 = arr1.length;
        int N2 = arr1[0].length;
        int[][] answer = new int[N1][N2];
        for (int i = 0; i < N1; i++) {
            for (int j = 0; j < N2; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}})));
        System.out.println(Arrays.deepToString(solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}})));
    }
}
