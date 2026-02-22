package sec16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex16_12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(list.size());

        // int index = 0;

        // while(index < 5) {
        //     System.out.println(list.get(index));
        //     index++;
        // }

        Iterator<Integer> iter = list.iterator();
        System.out.println(iter);

        // System.out.println(iter.next());
        // System.out.println(iter.next());
        // System.out.println(iter.next());
        // System.out.println(iter.next());
        // System.out.println(iter.hasNext());
        // System.out.println(iter.next());
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
