package sec08;

public class Calc {
  void sum(int num1, int num2) {
    System.out.println("두 수의 합은 "+ (num1 + num2) + "입니다.");
  }

  void sumArr(int[] nums) {
    int sum = 0;

    for (int num : nums) {
      sum += num;
    }

    System.out.println("숫자들의 합은 " + sum + "입니다.");
  }

  int sumArrInt(int[] nums) {
    int sum = 0;

    for (int num : nums) {
      sum += num;
    }

    return sum;
  }
}
