package sec14;

import java.util.Scanner;

public class Ex14_04 {
    public static void main(String[] args) {

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
    
                System.out.print("피제수를 입력하세요: ");
                int num1 = scanner.nextInt();
    
                System.out.print("제수를 입력하세요: ");
                int num2 = scanner.nextInt();
    
                int result = num1 / num2;
    
                System.out.println("나누기 결과: " + result);
            // } catch(Exception e) {
            } catch(ArithmeticException e) {
            // } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("0으로 나눌 수 없습니다.");
                
            }
            
        }
    }
}
