package sec14;

import java.util.Scanner;

class InputErrorException extends Exception {
    private String message = "나이를 잘못 입력하셨습니다.";

    @Override
    public String getMessage() {
        return this.message;
    }
}


public class Ex14_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int val = 0;

        while (true) {
            try {
                System.out.print("나이를 입력하세요: ");
                val = scanner.nextInt();

                if (val <= 0 || val >= 200) {
                    throw new InputErrorException();
                }
                
                System.out.println("당신의 나이는 [" + val + "]세입니다.");
            } catch (InputErrorException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
