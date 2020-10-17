package programers;

import java.util.*;

public class Algorithm2_06 {

    /*
        1 = 1
        2 = 3
        3 = 6
        4 = 10
        5 = 15
     */

    public static int[] solution(int n) {
        int max = n * (n+1) / 2;
        int size = n;
        int[][] arr = new int[n][n];
        int cur = 1;
        int x = -1, y = 0;
        while(true) {
            if (cur > max) break;
            for (int i = 0; i < n; i++) {
                arr[++x][y] = cur++;
            }
            n -= 1;
            for (int i = 0; i < n; i++) {
                arr[x][++y] = cur++;
            }
            n -= 1;
            for (int i = 0; i < n; i++) {
                arr[--x][--y] = cur++;
            }
            n -= 1;
        }

        int[] answer = new int[max];
        int idx = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i][j] != 0)
                    answer[idx++] = arr[i][j];
                else break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(4)));
        System.out.println(Arrays.toString(solution(5)));
        System.out.println(Arrays.toString(solution(6)));
    }
}
