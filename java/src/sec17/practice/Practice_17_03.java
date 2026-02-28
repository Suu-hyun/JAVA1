package sec17.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

@FunctionalInterface
interface Calc {
    double round(int point);
}

public class Practice_17_03 {
    public static void main(String[] args) {
        double val = 34.154886;

        Calc cal = (point) -> {
            double newVal = 0.0;
            newVal = new BigDecimal(val).setScale(point, RoundingMode.HALF_UP).doubleValue();
            return newVal;
        };

        System.out.println(cal.round(2));
    }
}
