package sec02;

public class Ex02_24 {
    public static void main(String[] args) {
        // 실수 -> 정수
        // 0.1234567 -> 0
        double num1 = 0.1234567;
        int num2 = (int) num1; // 강제 형변환!
        System.out.println(num2);

        // 정수 -> 실수
        // 1 -> 1.0
        int num3 = 1;
        float num4 = (float) num3;
        float num5 =  num3; // 자동 형변환 가능
        System.out.println(num4);
        System.out.println(num5);

        // 동일한 4byte라고 하더라도 데이터 표현 범위가 다름!
        int num6 = 99999999;
        float num7 = (float) num6;
        System.out.println(num6); // 99999999
        System.out.println(num7); // 1.0E8 (쓰레기 값)
        

    }
}
