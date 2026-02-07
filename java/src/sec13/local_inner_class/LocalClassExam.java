package sec13.local_inner_class;

class Local {
  private int speed = 10;

  void getUnit(String unitName) {

    // 지역 내부 클래스
    // 메서드 안에 정의
    class Unit {
      void move() {
        System.out.printf("%s이 %d 속도로 이동합니다.\n", unitName, speed);
      }
    }

    Unit unit = new Unit();
    unit.move();
  }
}

public class LocalClassExam {
  public static void main(String[] args) {
    Local local = new Local();
    local.getUnit("마린");
  }
}
