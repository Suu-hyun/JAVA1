package sec04;

import java.util.Scanner;

public class Ex04_07 {
    public static void main(String[] args) {
        // 여럿 중 하나
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        if (age > 19) {
            System.out.println("성인입니다.");
        } else if (age > 13) {
            System.out.println("청소년입니다.");
        } else if (age > 6) {
            System.out.println("어린이입니다.");
        } else {
            System.out.println("유아입니다.");
        }

        scanner.close();
    }
}
