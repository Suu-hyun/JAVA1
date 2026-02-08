package sec14;

import java.util.Scanner;

public class Ex14_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int val = 0;

        while (true) {
            try {
                System.out.print("숫자를 입력하세요(0~50): ");
                val = scanner.nextInt();

                if (val < 0 || val > 50) {
                    throw new Exception();
                }
                
                System.out.println("입력한 값은 [" + val + "]입니다.");
            } catch (Exception e) {
                System.out.println("숫자의 허용범위가 아닙니다.");
            }
        }

        // if (scanner != null) {
        //     scanner.close();
        // }
        // System.out.println("프로그램 종료");
    }
}
