package sec11;

class Bike {
  String riderName;
  int wheel = 2;

  Bike(String riderName) {
    this.riderName = riderName;
  }

  void info() {
    System.out.printf("%s의 자전거는 %d발 자전거입니다.\n", this.riderName, this.wheel);
  }

  void ride() {
    System.out.println("씽씽");
  }
}

class FourWheelBike extends Bike{
  FourWheelBike(String riderName) {
    super(riderName);
  }

  @Override
  void ride() {
    super.ride();
    System.out.println(this.riderName + "의 자전거가 바람을 가릅니다!");
  }

  void addWheel() {
    if (this.wheel == 2) {
      this.wheel = 4;
      System.out.println(riderName + "의 자전거에 보조 바퀴를 부착하였습니다.");
    } else {
      System.out.println(this.riderName + "의 자전거에 이미 보조 바퀴가 부착되어 있습니다.");
    }
  }
}

public class Ex11_08 {
  public static void main(String[] args) {
    FourWheelBike f = new FourWheelBike("김일남");
    f.info();
    f.addWheel();
    f.addWheel();
    f.info();
    f.ride();

    System.out.println("---");

    Bike b = f; // 자동 형변환
    b.info();
    // b.addWheel();
    // b.addWheel();
    b.ride();

    // f, b 객체는 동일 객체
    // f는 addWheel() 호출 가능, b는 불가! 
    System.out.println(f); // sec11.FourWheelBike@5674cd4d
    System.out.println(b); // sec11.FourWheelBike@5674cd4d
  }
}
