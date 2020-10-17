package programers;

import java.util.*;

public class Algorithm2_05 {

    public static int[] solution(int[] progresses, int[] speeds) {
//        Queue<Integer> q = new LinkedList<>();
//        int cnt;
//        for (int i = 0; i < progresses.length; i++) {
//            cnt = (int)Math.ceil((100 - progresses[i]) / (double)speeds[i]);
//            if (cnt == 0)
//                cnt = 1;
//            q.add(cnt);
//        }
//
//        List<Integer> list = new ArrayList<>();
//        int f = 1;
//        if (!q.isEmpty()) {
//            f = q.poll();
//        }
//        cnt = 1;
//
//        while (!q.isEmpty()) {
//            if (q.peek() <= f) {
//                q.poll();
//                cnt++;
//            } else {
//                list.add(cnt);
//                cnt = 1;
//                f = q.poll();
//            }
//        }
//        list.add(cnt);
//        return list.stream().mapToInt(Integer::intValue).toArray();
        int[] arr = new int[100];
        int day = -1;
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (day * speeds[i]) < 100) {
                day++;
            }
            arr[day]++;
        }
        return Arrays.stream(arr).filter(i -> i != 0).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93,30,55}, new int[]{1,30,5})));
        System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{99,1}, new int[]{1, 99})));
    }
}
