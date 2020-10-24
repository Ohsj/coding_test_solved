package com.nhn;

import java.util.*;

public class PreTest1_2020 {
    private static boolean isQuickPlayers(char player, char[] namesOfQuickPlayers, int numOfQuickPlayers) {
        for (int i = 0; i < numOfQuickPlayers; i++) {
            if (player == namesOfQuickPlayers[i]) return true;
        }
        return false;
    }

    private static void solution(int numOfAllPlayers, int numOfQuickPlayers, char[] namesOfQuickPlayers, int numOfGames, int[] numOfMovesPerGame) {
        char cur = 'A';
        Map<Character, Integer> cnt = new HashMap<>();
        for (int i = 0; i < numOfAllPlayers; i++) {
            if (i == 0) {
                cnt.put((char) ('A' + i), 1);
            } else {
                cnt.put((char) ('A' + i), 0);
            }
        }
        List<Character> order = new ArrayList<>();
        for (int i = 0; i < numOfAllPlayers - 1; i++) {
            order.add((char) ('B' + i));
        }
        int nextTarget = 0;
        for (int i = 0; i < numOfGames; i++) {
            int nextMove = numOfMovesPerGame[i] % (numOfAllPlayers - 1);
            nextTarget = (nextTarget + nextMove) % (numOfAllPlayers - 1);
            if (nextTarget < 0) nextTarget = (numOfAllPlayers - 1 + nextTarget);
            char target = order.remove(nextTarget);
            if (isQuickPlayers(target, namesOfQuickPlayers, numOfQuickPlayers)) {
                order.add(nextTarget, target);
            } else {
                order.add(nextTarget, cur);
                cur = target;
            }
            cnt.put(cur, cnt.get(cur) + 1);
        }

        for (char player : order) {
            System.out.println(player + " " + cnt.get(player));
        }

        System.out.println(cur + " " + cnt.get(cur));
    }


    public static void main(String[] args) {
        // B 0, C 0, D 0, A 1, F 0, E 2
        solution(6, 2, new char[]{'B', 'C'}, 2, new int[]{3, -2});

        System.out.println("=====================");
        // B 0, C 0, D 0, L 1, Q 1, A 3, F 2, I 0, J 0, G 1, K 1, M 0, N 0, H 1, P 0, E 1, O 1
        solution(17, 5, new char[]{'B', 'C', 'I', 'M', 'P'}, 11, new int[]{3, -4, 5, 6, -7, -8, 10, -12, -15, -20, 23});
    }
}
