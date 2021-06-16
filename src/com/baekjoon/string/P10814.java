package com.baekjoon.string;

/**
 * https://www.acmicpc.net/problem/10814
 */

import java.util.*;

public class P10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Member> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String age = sc.next();
            String name = sc.next();

            Member mem = new Member(Integer.parseInt(age), name);
            list.add(mem);
        }

        Collections.sort(list);
        for (Member mem : list) {
            System.out.println(mem);
        }


    }

    static class Member implements Comparable<Member> {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Member m1) {
            return Integer.compare(this.age, m1.age);
        }

        @Override
        public String toString() {
            return this.age + " " + this.name;
        }
    }
}
