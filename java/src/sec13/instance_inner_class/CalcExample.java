package sec13.instance_inner_class;

class Calc {
  private int val1;
  private int val2;

  public Calc(int val1, int val2) {
    this.val1 = val1;
    this.val2 = val2;
  }

  // 인스턴스 내부 클래스
  class InnerCalc {
    int add() {
      return val1 + val2;
    }
  }
}

public class CalcExample {
  public static void main(String[] args) {
    Calc calc = new Calc(1, 2);
    Calc.InnerCalc innerCalc = calc.new InnerCalc(); // 인스턴스 내부 클래스 객체 생성
    System.out.println(innerCalc.add());
  }
}
