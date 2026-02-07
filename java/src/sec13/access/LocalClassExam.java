package sec13.access;

class Local {
  private int speed = 10;

  void getUnit(String unitName) {

    // unitName += "님"; // 매개변수는 상수 취급하기 때문에 변경 불가!
    String newUnitName = unitName + "님";
    
    // 지역 내부 클래스
    // 메서드 안에 정의
    class Unit {
      void move() {
        System.out.printf("%s이 %d 속도로 이동합니다.\n", newUnitName, speed);
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
