package sec17.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {
    public static void main(String[] args) {
        // 부동 소수점 오차 발생
        double num = 0.1 + 0.1 + 0.1;
        System.out.println(num); // 0.30000000000000004

        BigDecimal num1 = new BigDecimal("0.1");
        BigDecimal num2 = new BigDecimal("0.1");
        BigDecimal num3 = new BigDecimal("0.1");

        System.out.println(num1.add(num2).add(num3)); // 메서드 체이닝

        String strNum = "1.234567890";

        System.out.println(new BigDecimal(strNum).setScale(2, RoundingMode.FLOOR));
        System.out.println(new BigDecimal(strNum).setScale(2, RoundingMode.CEILING));
        System.out.println(new BigDecimal(strNum).setScale(3, RoundingMode.HALF_UP));
    }
}
