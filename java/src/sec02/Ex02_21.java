package sec02;

public class Ex02_21 {
    public static void main(String[] args) {
        int num1 = 1;
        System.out.println(num1); // 1

        // double num2 = (double) num1;
        double num2 = num1; // 자동 형변환
        System.out.println(num2); // 1.0

        // int : 4byte
        // double : 8byte
        // 작은 타입에서 큰 타입으로 변환할 때는 자동 형변환 가능
    }
}
