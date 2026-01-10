package sec02;

public class Ex02_22 {
    public static void main(String[] args) {
        // 정수형 -> 정수형
        int num1 = 1;
        byte num2 = (byte) num1; // 강제 형변환
        System.out.println(num2);

        // int : 4byte
        // byte : 1byte
        
        // 강제 형변환 시 주의 사항
        // 데이터 표현 범위를 넘으면 쓰레기 값 생성됨
        int num3 = 128;
        byte num4 = (byte)num3;
        System.out.println(num4);
    }
}
