package sec02;

public class Ex02_25 {
    public static void main(String[] args) {
        int num1 = 65;
        double num2 = 0.1234;

        double num3 = num1; // 자동
        System.out.println(num3); // 65.0

        int num4 = (int)num2; // 강제
        System.out.println(num4); // 0

        char c = (char) num1; // 강제
        System.out.println(c); // A

        float num5 = c; // 자동
        System.out.println(num5); // 65.0

        // 자동 형변환 == 묵시적 == 업 캐스팅(Up Casting)
        // 강제 형변환 == 명시적 == 다운 캐스팅(Down Casting)
    }
}
