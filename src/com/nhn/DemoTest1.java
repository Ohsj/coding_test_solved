package com.nhn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
    Test input
    6
    0 1 1 0 0 0
    0 1 1 0 1 1
    0 0 0 0 1 1
    0 0 0 0 1 1
    1 1 0 0 1 0
    1 1 1 0 0 0

    4
    0 0 0 0
    0 0 0 0
    0 0 0 0
    0 0 0 0
 */

public class DemoTest1 {
    private static int dfs(int[][] matrix, boolean[][] check, int x, int y, int max) {
        if (x >= 0 && x < max && y >= 0 && y < max) {
            if (check[x][y] || matrix[x][y] == 0) return 0;

            check[x][y] = true;
            int cnt = 1;
            cnt += dfs(matrix, check, x + 1, y, max);
            cnt += dfs(matrix, check, x - 1, y, max);
            cnt += dfs(matrix, check, x, y + 1, max);
            cnt += dfs(matrix, check, x, y - 1, max);
            return cnt;
        } else {
            return 0;
        }
    }

    private static void solution(int sizeOfMatrix, int[][] matrix) {
        // TODO: 이곳에 코드를 작성하세요.
        boolean[][] check = new boolean[sizeOfMatrix][sizeOfMatrix];
        List<Integer> eachArea = new ArrayList<>();

        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                if (!check[i][j] && matrix[i][j] != 0) {
                    int res = dfs(matrix, check, i, j, sizeOfMatrix);
                    if (res != 0)
                        eachArea.add(res);
                }
            }
        }

        if (eachArea.size() == 0) {
            System.out.println(0);
        } else {
            System.out.println(eachArea.size());
            Collections.sort(eachArea);
            for (Integer integer : eachArea) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    private static class InputData {
        int sizeOfMatrix;
        int[][] matrix;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.sizeOfMatrix = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.matrix = new int[inputData.sizeOfMatrix][inputData.sizeOfMatrix];
            for (int i = 0; i < inputData.sizeOfMatrix; i++) {
                String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
                for (int j = 0; j < inputData.sizeOfMatrix; j++) {
                    inputData.matrix[i][j] = Integer.parseInt(buf[j]);
                }
            }
        }

        return inputData;
    }

    public static void main(String[] args) {
//        InputData inputData = processStdin();

        int[][] matrix1 = {
                {0, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 1},
                {0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 1, 1},
                {1, 1, 0, 0, 1, 0},
                {1, 1, 1, 0, 0, 0}};

        solution(matrix1.length, matrix1);

        int[][] matrix2 = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};

        solution(matrix2.length, matrix2);
    }
}
