package com.nhn;

public class PreTest2_2020 {
    //      3
//      3 % % 3
//      3 % % 3
//      3 % 3 3
//      3 3 3 3 % 2
//3 % % 3 3 3 3 % 2
//3 % % 3 3 3 3 % 2 3
//3 3 % 3 3 3 3 % 2 3
//3 3 % 3 3 2 * * 2 3
//3 3 % 3 3 2 * * 2 2
//3 2 * * * 2 * * 2 2
//2 1 * * * 2 * * 2 2
//2 1 2 * * 2 * * 2 2
//2 1 2 * 2 2 * * 2 2
//2 1 2 * 2 2 * * 2 2
//2 1 # # 1 2 * * 2 2
//2 1 # # 1 # # 1 2 2
//1 1 # # 1 # # 1 # 1
//1 1 # # 1 # # 1 # 1
//1 1 # # 1 1 # 1 # 1
//1 1 # # 1 1 # 1 1 1
//1 1 # 1 1 1 # 1 1 1
//1 1 # 1 1 1 # 1 1 1
//------------------------------
//1 27
//2 26
//3 16
//-------
//  69
    private static void solution(int day, int width, int[][] blocks) {
        int answer = 0;
        int[] wall = new int[width];

        for (int i = 0; i < blocks.length; i++) {
            for (int j = 0; j < width; j++) {
                wall[j] += blocks[i][j];
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        // answer 20
        solution(2, 6, new int[][]{{6, 2, 11, 0, 3, 5}, {6, 3, 0, 9, 0, 5}});
        // answer 69
        solution(3, 10, new int[][]{{6, 12, 0, 2, 8, 4, 0, 7, 3, 6}, {6, 1, 3, 0, 2, 8, 0, 0, 13, 8}, {6, 3, 0, 10, 6, 5, 7, 0, 0, 3}});
    }
}
