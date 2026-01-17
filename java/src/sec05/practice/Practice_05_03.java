package sec05.practice;

public class Practice_05_03 {
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 1 ; i <= 100; i++) {
      if (i % 2 == 0) {
        // System.out.println(i);
        sum += i;
      }
    }

    System.out.println("짝수 합: " + sum);
  }
}
