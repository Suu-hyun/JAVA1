package sec02;

public class Ex02_13 {
    public static void main(String[] args) {
        float num1 = 0.123456789f; // 0.12345679(8자리 까지 표현, 그 이하 반올림 처리)
        System.out.println(num1);

        // 리트럴의 기본 값은 double 타입!
        double num2 = 0.1234567890123456789; // 0.12345678901234568(17자리 까지 표현, 그 이하 반올림 처리)
        System.out.println(num2);
    }
}
