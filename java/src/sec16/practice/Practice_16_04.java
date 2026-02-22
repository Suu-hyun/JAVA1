package sec16.practice;

import java.util.ArrayList;
import java.util.List;

public class Practice_16_04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            // 1 ~ 100 숫자 중 난수를 list에 추가하세요!
            list.add((int)(Math.random() * 100) + 1);
        }

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            // 짝수만 sum에 누적하세요!
            int val = list.get(i);
            System.out.print(val + " ");
            if (val % 2 == 0) {
                sum += val;
            }
        }

        System.out.println("짝수의 합: " + sum);
    }
}
