package com.nhn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreTest1_2019 {
    static int N = 10;
    static int[][] check = new int[N][N];
    static int[][] map = {
            {0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0},
            {1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0},
            {1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0}

//            {0,0,0,0},
//            {0,0,0,0},
//            {0,0,0,0},
//            {0,0,0,0}

//            {1,0,0,0},
//            {1,0,0,0},
//            {0,0,0,0},
//            {0,0,1,1}
    };

    public static int getCounts(int x, int y) {
        if (x < 0 || x >= N || y < 0 || y >= N) return 0;

        int count = 0;
        if (check[x][y] == 0) {
            check[x][y] = 1;
            if (map[x][y] == 1) {
                count = 1;
                count += getCounts(x + 1, y);
                count += getCounts(x, y + 1);
                count += getCounts(x - 1, y);
                count += getCounts(x, y - 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        // o(n^2)
        Long start = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int cnt = getCounts(i,j);
                if (cnt != 0)
                    res.add(cnt);
            }
        }

        if (res.size() == 0)
            System.out.println(0);
        else {
            int[] solution = res.stream().mapToInt(Integer::intValue).toArray();
            Arrays.sort(solution);
            System.out.println(Arrays.toString(solution));
        }

        Long end = System.currentTimeMillis();

        System.out.println(end - start + "ms");
    }
}
