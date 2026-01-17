package sec05;

public class Ex05_07 {
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 1) {
        continue; // 반복 유지, continue 아래에 있는 코드 실행
      }
      sum += i;
    }

    System.out.println("짝수 합: " + sum);
  }
}
