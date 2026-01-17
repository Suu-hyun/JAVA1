package sec05;

public class Ex05_06 {
  public static void main(String[] args) {
    int sum = 0;
    int i = 1;

    do {
      // 조건식과 상관없이 1번 실행
      sum += i;
      i++;
    } while (i <= 0);

    System.out.println("합: " + sum);
  }
}
