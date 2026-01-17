package sec05;

import java.util.Scanner;

public class Ex05_08 {
  public static void main(String[] args) {
    
    // System.out.println(Math.random()); // double 타입 무작위 수(난수) 반환(0 <= 값 < 1)
    // System.out.println((int)(Math.random() * 10) + 1); // 1~10 난수 반환

    int magicNumber = (int)(Math.random() * 10) + 1;
    System.out.println(magicNumber);
    
    boolean isWin = false;

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
    
      System.out.print("찾는 숫자를 입력 >> ");
      int guess = scanner.nextInt();

      if (guess == magicNumber) {
        System.out.println((i + 1) + "번 만에 맞췄습니다!");
        isWin = true;
        break; // 반복을 중단, break 아래에 있는 코드 실행 안함!
      } else if (guess > magicNumber) {
        System.out.println("맞춰야할 숫자가 더 작습니다.");
      } else{
        System.out.println("맞춰야할 숫자가 더 큽니다.");
      }

    }
    if (!isWin) {
      System.out.println("정답을 맞추지 못했습니다.");
    }

    scanner.close();
  }
}
