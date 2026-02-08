package sec14;

import java.util.InputMismatchException;
import java.util.Scanner;

class ThrowsExceptionExample {
    // 예외 던지기 (throws 키워드)
    // 생략해도 동일한 결과
    // 메서드를 호출하는 쪽에 명시적으로 해당 예외가 발생할 수 있음을 알려주어
    // 해당 예외 처리를 강요!
    void checkyourSelf(Scanner scanner) throws InputMismatchException {
        System.out.println("1. 사람과 어울리는 것이 좋다.");
        System.out.println("2. 혼자 있는 것이 좋다.");
        System.out.print("선택: ");

        int check = scanner.nextInt();
        
        try {
            if(check == 1) {
                System.out.println("당신은 ENFP");
            } else {
                System.out.println("당신은 ISFP");
            }
        } catch (InputMismatchException e) {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}

public class Ex14_09 {
    public static void main(String[] args) {
        System.out.println("[성격 유형 검사]");
        
        ThrowsExceptionExample tee = new ThrowsExceptionExample();

        try {
            tee.checkyourSelf(new Scanner(System.in));
        } catch (InputMismatchException e) {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
