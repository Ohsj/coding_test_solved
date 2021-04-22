package com.baekjoon.greedy;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/1931
 */

public class P1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Room[] rooms = new Room[N];
        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            rooms[i] = new Room(s, e);
        }
        Arrays.sort(rooms);

        System.out.println(Arrays.toString(rooms));

        int res = 1;
        int curEnd = rooms[0].end;
        for (int i = 1; i < N; i++) {
            if (curEnd <= rooms[i].start) {
                res++;
                curEnd = rooms[i].end;
            }
        }
        System.out.println(res);
    }
}

class Room implements Comparable<Room> {
    int start;
    int end;

    public Room(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "{start: " + start + ", end: " + end + "}";
    }

    @Override
    public int compareTo(Room o) {
        if (end > o.end) {
            return 1;
        } else if (end < o.end) {
            return -1;
        } else {
            return Integer.compare(start, o.start);
        }
    }
}
