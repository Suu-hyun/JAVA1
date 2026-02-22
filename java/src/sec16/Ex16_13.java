package sec16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex16_13 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(null);
        
        System.out.println(set);

        // Iterator 인터페이스
        // 컬렉션 프레임워크 객체를 동일한 방법으로 순회 가능하게 함
        Iterator<Integer> iter = set.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
