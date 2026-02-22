package sec16;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex16_08 {
    public static void main(String[] args) {
        // 중간에 요소 삽입, 삭제가 빈번한 경우에는 LinkedList가 성능상 유리!
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        // System.out.println(startTime);
        
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        
        long endTime = System.nanoTime();

        System.out.println("ArrayList 추가 시간:\t" + (endTime - startTime));
        
        startTime = System.nanoTime();
        
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        
        endTime = System.nanoTime();

        System.out.println("LinkedList 추가 시간:\t" + (endTime - startTime));

        System.out.println("---");

        startTime = System.nanoTime();
        
        for (int i = 0; i < 1000; i++) {
            arrayList.add(1, i);
        }

        System.out.println("---");
        
        endTime = System.nanoTime();

        System.out.println("ArrayList 삽입 시간:\t" + (endTime - startTime));
        
        startTime = System.nanoTime();
        
        for (int i = 0; i < 1000; i++) {
            linkedList.add(1, i);
        }

        endTime = System.nanoTime();

        System.out.println("LinkedList 삽입 시간:\t" + (endTime - startTime));

        System.out.println("---");

        startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            arrayList.remove(1);
        }

        endTime = System.nanoTime();

        System.out.println("ArrayList 삭제 시간:\t" + (endTime - startTime));
        
        startTime = System.nanoTime();
        
        for (int i = 0; i < 100; i++) {
            linkedList.remove(1);
        }

        endTime = System.nanoTime();

        System.out.println("LinkedList 삭제 시간:\t" + (endTime - startTime));

    }
}
