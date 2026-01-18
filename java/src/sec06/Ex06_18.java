package sec06;

import java.util.Scanner;

public class Ex06_18 {
  public static void main(String[] args) {
    int[][] lotto = {
      {2, 6, 11, 33, 42, 44},
      {1, 6, 17, 22, 24, 33},
    };

    Scanner scanner = new Scanner(System.in);
    String myNum = "";
    System.out.print("당첨 숫자 6개를 연속으로 입력해주세요 >> ");
    myNum = scanner.next();

    boolean isWin = false;
    
    String lottoNum = "";

    for (int i = 0; i < lotto.length; i++) {
      lottoNum = "";

      for (int j = 0; j < lotto[i].length; j++) {
        lottoNum += lotto[i][j];
      }

      if (myNum.equals(lottoNum)) {
        isWin = true;
        break;
      }
    }

    if (isWin) {
      System.out.println(myNum + "번호 당첨!");
    } else {
      System.out.println("당첨되지 못했습니다.");
      System.out.println("당첨 번호는 " + lottoNum + "입니다.");
    }
    
    scanner.close();
  }
}
