package sec06.practice;

public class Practice_06_02 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int sum = 0;

    // for (int i = 0; i < arr.length; i++) {
    //   if (arr[i] % 2 == 0) {
    //     sum += arr[i];
    //   }
    // }

    // 향상된 for문 사용
    for (int number : arr) {
      if (number % 2 == 0) {
        sum += number;
      }
    }

    System.out.println("짝수들의 합: " + sum);

  }
}
