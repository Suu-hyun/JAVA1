package sec03;

public class Ex03_09 {
    public static void main(String[] args) {
        // 이항 연산자
        // 산술 연산자(+ - * / %)
        System.out.println(1 + 2);
        System.out.println(1 - 2);
        System.out.println(1 * 2); // 곱하기
        System.out.println(5 / 2); // 나누기
        System.out.println(5 % 2); // 나머지

        // 나머지 연산자는 홀/짝 수 구할 때 많이 사용함
        System.out.println(1 % 2); // 1 -> 홀
        System.out.println(3 % 2); // 1 -> 홀
        System.out.println(4 % 2); // 0 -> 짝
        System.out.println(6 % 2); // 0 -> 짝
    }
}
