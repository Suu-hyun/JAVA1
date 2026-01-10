package sec02;

public class Ex02_23 {
    public static void main(String[] args) {
        double num1 = 1.0e100; // float 양수 범위를 넘어선 값
        float num2 = (float) num1;
        System.out.println(num2); // Infinity

        double num3 = 1.0e-100; // float 음수 범위를 넘어선 값
        float num4 = (float) num3;
        System.out.println(num4); // 0.0
    }
}
