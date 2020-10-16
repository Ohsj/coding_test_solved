package com.algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class Algorithm1_26 {
    public static int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int min = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(min) > list.get(i)) {
                min = i;
            }
        }
        list.remove(min);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] sample1 = {4,3,2,1};
        int[] sample2 = {10};
        System.out.println(Arrays.toString(solution(sample1)));
        System.out.println(Arrays.toString(solution(sample2)));
    }
}
