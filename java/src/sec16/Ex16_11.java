package sec16;

import java.util.HashSet;
import java.util.Set;

public class Ex16_11 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        System.out.println(set); // []

        set.add("사과");
        set.add("사과");
        set.add("사과"); // 중복 허용하지 않음
        set.add("망고"); // [망고, 사과] 순서 보장하지 않음(인데스 없음)
        set.add("멜론");

        System.out.println(set); // [망고, 멜론, 사과]
        System.out.println(set.size()); // 3

        set.remove("망고");

        System.out.println(set); // [멜론, 사과]

        set.clear();

        System.out.println(set); // []
    }
}
