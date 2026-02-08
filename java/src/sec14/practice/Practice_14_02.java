package sec14.practice;

import java.util.Scanner;

public class Practice_14_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int data = 0;
        int sum = 0;
        
        while (count < 5) {
            try {
                System.out.print("숫자를 입력하세요: ");
                data = scanner.nextInt();

                if (data < 0) {
                    throw new Exception("음수는 입력할 수 없습니다.");
                }

                sum += data;
                count++;
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("숫자 합: " + sum);
        scanner.close();
    }
}
