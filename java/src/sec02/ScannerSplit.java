package sec02;

import java.util.Scanner;

public class ScannerSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name, gender; 

        System.out.print("이름, 성별, 나이, 키를 공백으로 구분해 입력하세요: ");
        name = scanner.next();
        gender = scanner.next();
        int age = scanner.nextInt();
        double height = scanner.nextDouble();

        System.out.printf("당신의 이름은 %s입니다.\n", name);
        System.out.printf("당신의 성별은 %s입니다.\n", gender);
        System.out.printf("당신의 나이는 %d입니다.\n", age);
        System.out.printf("당신의 키는 %.1f입니다.\n", height);

        scanner.close();
    }
}
