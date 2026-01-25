package sec10;

public class Computer {
  void powerOn() {
    System.out.println("삑~ 컴퓨터가 켜졌습니다.");
  }
  
  void powerOff() {
    System.out.println("컴퓨터가 종료됩니다.");
  }
}

class SamsongComputer extends Computer {
  String brandName = "삼송";

  // 메서드 오버라이딩(재정의, 최우선시 되는)
  @Override
  void powerOn() {
    super.powerOn();
    System.out.println("아리 러브" + this.brandName);
  }
}
