package sec12;

abstract class Phone {
  abstract void openingLogo();

  void powerOn() {
    this.openingLogo();
    System.out.println("폰이 켜집니다.");
  }
  void powerOff() {
    System.out.println("폰이 꺼집니다.");
  }
}

class ApplePhone extends Phone {
  @Override
  void openingLogo() {
    System.out.println("@@@");
  }
}

class ThreeStarPhone extends Phone {
  @Override
  void openingLogo() {
    System.out.println("***");
  }
}

public class Ex12_08 {
  public static void main(String[] args) {
    // ApplePhone apple = new ApplePhone();
    Phone apple = new ApplePhone(); // 추상 클래스는 스스로 객체 생성 불가 하지만 객체의 타입으로 사용 가능
    // apple.openingLogo();
    apple.powerOn();
    apple.powerOff();

    ThreeStarPhone star = new ThreeStarPhone();
    // star.openingLogo();
    star.powerOn();
    star.powerOff();
  }
}
