package sec03;

public class Ex03_12 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;

        // num1 = num1 + num2;
        num1 += num2; // 복합 대입 연산자
        System.out.println(num1); // 7

        num1 = 5;

        num1 -= num2;
        System.out.println(num1); // 3

        num1 = 5;

        num1 *= num2;
        System.out.println(num1); // 10

        num1 = 5;

        num1 /= num2;
        System.out.println(num1); // 2

        num1 = 5;

        num1 %= num2;
        System.out.println(num1); // 1
    }
}
