package sec02;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("나이를 입력해 주세요: ");
        int age = scanner.nextInt();

        System.out.printf("\n당신의 나이는 %d세 입니다.\n", age);
        scanner.close(); // 메모리 누수를 방지하기 위해 메모리에서 객체 제거
    }
}
