package sec14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex14_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int[] cards = {1, 2, 3, 4, 5};
    
            System.out.print("몇 번째 카드를 뽑으시겠습니까? ");
            int cardIndex = scanner.nextInt();
            
            System.out.println("뽑은 카드 번호: " + cards[cardIndex - 1]);
            // 다중 예외 처리
            // 예외 클래스의 순서 유의!
        } catch (InputMismatchException e) {
            System.out.println("잘못 입력하셨습니다. 숫자만 가능합니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("해당 번호의 카드는 없습니다.");
        } catch (Exception e) {
                System.out.println("알 수 없는 예외입니다.");
        }

        scanner.close();
    }
}
