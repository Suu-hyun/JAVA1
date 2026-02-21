package sec15.practice;

import java.util.Scanner;

public class Practice_15_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int matchValue = 0;
        int value = 0;

        matchValue = (int)(Math.random() * 30) + 1;

        System.out.println(matchValue); // 정답 확인용
        
        while(count < 10) {
            count++;
            System.out.print("맞출 숫자 입력 : ");
            value = scanner.nextInt();
            
            // up & down 게임 코드를 완성하세요!
                if (value > matchValue) {
                    System.out.println("DOWN");
                } else if (value < matchValue) {
                    System.out.println("UP");
                } else {
                    System.out.println("정답입니다!");
                    System.out.println(count + "번 만에 맞췄습니다.");
                    break;
            }   
        }

        if (count == 10) {
            System.out.println("정답을 맞추지 못했습니다.");
        }

        scanner.close();
    }
}
