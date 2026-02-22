package sec16.practice;

import java.util.HashMap;
import java.util.Map;

public class Practice_16_05 {
    public static void main(String[] args) {
        String[] balls = {
            "빨간색",
            "빨간색",
            "빨간색",
            "빨간색",
            "파란색",
            "파란색",
            "파란색",
            "검은색",
            "검은색",
            "검은색"
        };

        Map<String, Integer> map = new HashMap<>();

        for (String ball : balls) {
            // System.out.println(ball);

            if (map.containsKey(ball)) {
                map.put(ball, map.get(ball) + 1);
            } else {
                map.put(ball, 1);
            }
        }

        // System.out.println(map);
        System.out.println("빨간색: " + map.get("빨간색") + "개");
        System.out.println("파란색: " + map.get("파란색") + "개");
        System.out.println("검은색: " + map.get("검은색") + "개");
    }
}
