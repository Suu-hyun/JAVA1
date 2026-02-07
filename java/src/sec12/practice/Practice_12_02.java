package sec12.practice;

abstract class Bike {
  int wheel;

  Bike(int wheel) {
    this.wheel = wheel;
  }

  void info() {
    System.out.println("이 자전거는 " + wheel + "발 자전거입니다.");
  }

  abstract int getWheel(); // 자식 클래스에서 반드시 구현하도록 강제!
}

class ChildBike extends Bike {
  ChildBike(int wheel) {
    super(wheel); // 부모 클래스의 생성자 반드시 호출해야 함
  }

  int getWheel() {
    return wheel;
  }
}

public class Practice_12_02 {
  public static void main(String[] args) {
    // Bike b = new Bike(2); // 추상 클래스는 객체 생성 불가

    ChildBike cb = new ChildBike(4);
    System.out.println(cb.getWheel());
  }
}
