package com.algorithm;

import java.util.Arrays;

public class Algorithm2_12 {

    public static int dfs(int[][] picture, boolean[][] isVisit, int x, int y, int maxX, int maxY, int color) {
        int areaSize = 0;
        if (x >= 0 && x < maxX && y >= 0 && y < maxY) {
            if (isVisit[x][y] || picture[x][y] != color || picture[x][y] == 0) return 0;
            isVisit[x][y] = true;

            areaSize++;
            areaSize += dfs(picture, isVisit, x + 1, y, maxX, maxY, color);
            areaSize += dfs(picture, isVisit, x - 1, y, maxX, maxY, color);
            areaSize += dfs(picture, isVisit, x, y + 1, maxX, maxY, color);
            areaSize += dfs(picture, isVisit, x, y - 1, maxX, maxY, color);
        }
        return areaSize;
    }

    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        int curColor;
        int areaSize;

        boolean[][] isVisit = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!isVisit[i][j] && picture[i][j] != 0) {
                    curColor = picture[i][j];
                    numberOfArea++;
                    areaSize = dfs(picture, isVisit, i, j, m, n, curColor);
                    if (maxSizeOfOneArea < areaSize)
                        maxSizeOfOneArea = areaSize;
                }

            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(6, 4, new int[][]{
                        {1, 1, 1, 0},
                        {1, 2, 2, 0},
                        {1, 0, 0, 1},
                        {0, 0, 0, 1},
                        {0, 0, 0, 3},
                        {0, 0, 0, 3}})));
        System.out.println(Arrays.toString(solution(13, 16, new int[][]{
                {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},
                {0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
                {0,1,1,1,1,2,1,1,1,1,2,1,1,1,1,0},
                {0,1,1,1,2,1,2,1,1,2,1,2,1,1,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,3,3,3,1,1,1,1,1,1,3,3,3,1,0},
                {0,1,1,1,1,1,2,1,1,2,1,1,1,1,1,0},
                {0,0,1,1,1,1,1,2,2,1,1,1,1,1,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},
                {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0}
        })));
        System.out.println(Arrays.toString(solution(1, 1, new int[][]{{0}})));
    }
}
