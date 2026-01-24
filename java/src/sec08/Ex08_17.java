package sec08;

public class Ex08_17 {
  public static void main(String[] args) {
    int[] stu1 = {97, 53};
    int[] stu2 = {95, 66};

    Calc calc = new Calc();
    int sum1 = calc.sumArrInt(stu1);
    int sum2 = calc.sumArrInt(stu2);

    System.out.println(sum1);
    System.out.println(sum2);

    if (sum1 > sum2) {
      System.out.println("학생 1이 더 높습니다.");
    } else if (sum2 > sum1) {
      System.out.println("학생 2가 더 높습니다.");
    } else {
      System.out.println("총점이 같습니다.");
    }
  }
}
