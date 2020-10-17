package programers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Algorithm2_09 {

    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> kind = new HashMap<>();
        for (String[] clothe : clothes) {
            kind.put(clothe[1], kind.getOrDefault(clothe[1], 1) + 1);
        }

        for (String key : kind.keySet())
            answer *= kind.get(key);

        return answer - 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[][] {{"yellow_hat" , "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
        System.out.println(solution(new String[][] {{"crow_mask" , "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
    }
}
