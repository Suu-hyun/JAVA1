package sec16;

import java.util.LinkedList;
import java.util.List;

public class Ex16_07 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        System.out.println(list); // []

        list.add("딸기"); // 끝에 추가
        list.add("바나나");
        list.add("망고");
        list.add(1, "수박"); // 중간에 삽입

        System.out.println(list); // [딸기, 수박, 바나나, 망고]

        list.set(0, "복숭아"); // 특정 인덱스 요소 값 수정

        System.out.println(list); // [복숭아, 수박, 바나나, 망고]
        
        list.remove(2); // 인덱스 이용한 요소 삭제
        
        System.out.println(list); // [복숭아, 수박, 망고]
        
        list.remove("수박"); // 객체 요소 삭제

        System.out.println(list); // [복숭아, 바나나]

        System.out.println(list.get(0)); // 복숭아
        System.out.println(list.get(1)); // 바나나
        // System.out.println(list.get(2)); // IndexOutOfBoundsException
        
        System.out.println(list.contains("복숭아")); // true
        System.out.println(list.contains("딸기")); // false

        System.out.println(list.size()); // 2

        list.clear(); // 전체 요소 삭제

        System.out.println(list); // []
    }
}
