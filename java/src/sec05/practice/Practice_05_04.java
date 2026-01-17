package sec05.practice;

public class Practice_05_04 {
  public static void main(String[] args) {
    // 주사위 2개
    // 동시에 던지기(while)
    // 같은 값 여부(if)
    // 반복 횟수, 값 출력
    int count = 1;

    while (true) {
      count++;
      
      int dice1 = (int)(Math.random() * 6) + 1;
      int dice2 = (int)(Math.random() * 6) + 1;
      
      if (dice1 == dice2) {
        System.out.println("주사위1: " + dice1 + ", 주사위2: " + dice2);
        System.out.println("반복 횟수: " + count);

        break;
      }
    }
  }
}
