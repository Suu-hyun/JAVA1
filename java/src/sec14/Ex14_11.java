package sec14;

import java.util.Scanner;

public class Ex14_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int val = 0;

        while (true) {
            try {
                System.out.print("나이를 입력하세요: ");
                val = scanner.nextInt();

                // 의도적(고의)적으로 예외 일으키기
                // 유효성 검사에서 사용
                if (val <= 0 || val >= 200) {
                    throw new Exception("잘못 입력하셨습니다.");
                }
                
                System.out.println("당신의 나이는 [" + val + "]세입니다.");
            } catch (Exception e) {
                // System.out.println(e);
                System.out.println(e.getMessage());
            }
        }
    }
}
