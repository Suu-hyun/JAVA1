package sec04;

import java.util.Scanner;

public class Ex04_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("2026년 1월 요일 출력기");
        
        System.out.print("날짜를 입력하세요: ");
        int day = scanner.nextInt();

        switch (day) {
            case 4:
                System.out.println("일요일");
                break;
            case 5:
                System.out.println("월요일");
                break;
            case 6:
                System.out.println("화요일");
                break;
            case 7:
                System.out.println("수요일");
                break;
            case 8:
                System.out.println("목요일");
                break;
            case 9:
                System.out.println("금요일");
                break;
            case 10:
                System.out.println("토요일");
                break;
            default:
                System.out.println("알 수 없음");
        }

        scanner.close();
    }
}
