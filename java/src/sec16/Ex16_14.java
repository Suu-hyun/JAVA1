package sec16;

import java.util.HashMap;
import java.util.Map;

public class Ex16_14 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        System.out.println(map); // {}

        map.put("사과", 2);
        map.put("딸기", 5);
        map.put("망고", 1);

        System.out.println(map);

        map.put("망고", 3); // 키는 중복 허용하지 않음. 기존 값 변경함.

        System.out.println(map);

        System.out.println(map.containsKey("사과")); // true
        System.out.println(map.containsKey("포도")); // false
        System.out.println(map.containsValue(1));
        System.out.println(map.containsValue(3));

        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        map.remove("사과");
        System.out.println(map);
    }
}
