package sec12.inter;

// 인터페이스
// 구성 요소: 상수, 추상 메서드
// 추상 메서드 작성(public abstract)
// 메서드에서 public abstract 생략 가능
// 상수에서 public static final 생략 가능
// 접근 제한자는 public(생략해도 default 아님)
interface Phone {
  // 자바에서 상수는 대문자 스네이크 케이스로 작명
  // public static final int Max_BATTERY_CAPACITY = 100;
  int Max_BATTERY_CAPACITY = 100; // 상수

  // public abstract void powerOn();
  // public abstract void powerOff();
  // public abstract boolean isOn();
  // public abstract void watchUtube();
  // public abstract void charge();
  void powerOn();
  void powerOff();
  boolean isOn();
  void watchUtube();
  void charge();
}

class ApplePhone implements Phone {
  int batteryCapacity = 40;
  boolean isOn = false;

  // 인터페이스의 메서드 구현시 접근 제한자 public 반드시 붙여야 함!
  @Override
  public void powerOn() {
    if (batteryCapacity > 30) {
      System.out.println("@@@Power On!!!");
      this.isOn = true;
    } else {
      System.out.println("Low Battery...");
    }
  }

  @Override
  public void powerOff() {
    System.out.println("@@@Power Off!!!");
    this.isOn = false;
  }

  @Override
  public boolean isOn() {
    if (isOn) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void watchUtube() {
    if (batteryCapacity > 10) {
      System.out.println("--- Watching Utube ---");
      batteryCapacity -= 10;
      System.out.println("battery is..." + batteryCapacity + "%");
      System.out.println("----------------------");
    } else {
      System.out.println("Low battery...");
      powerOff();
    }
  }

  @Override
  public void charge() {
    if (batteryCapacity < Phone.Max_BATTERY_CAPACITY - 20) {
      System.out.println("--- Charging ---");
      batteryCapacity += 5;
      System.out.println("Charged..." + batteryCapacity + "%");
      System.out.println("----------------");
    } else {
      System.out.println("You don't have to charge...");
      System.out.println("It's enough..." + batteryCapacity + "%");
    }
  }
}

class ThreeStarPhone implements Phone {
  int batteryCapacity = 30;
  boolean isOn = false;

  @Override
  public void powerOn() {
    if (batteryCapacity > 30) {
      System.out.println("***폰이 켜졌습니다.");
      this.isOn = true;
    } else {
      System.out.println("배터리가 부족합니다...");
    }
  }

  @Override
  public void powerOff() {
    System.out.println("***폰이 꺼졌습니다.");
    this.isOn = false;
  }

  @Override
  public boolean isOn() {
    if (isOn) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void watchUtube() {
    if (batteryCapacity > 10) {
      System.out.println("--- 유튜브 시청 중 ---");
      batteryCapacity -= 5;
      System.out.println("잔여 배터리" + batteryCapacity + "%");
      System.out.println("----------------------");
    } else {
      System.out.println("배터리가 부족합니다...");
      powerOff();
    }
  }

  @Override
  public void charge() {
    if (batteryCapacity < Phone.Max_BATTERY_CAPACITY - 20) {
      System.out.println("--- 충전 중 ---");
      batteryCapacity += 10;
      System.out.println("잔여 배터리..." + batteryCapacity + "%");
      System.out.println("----------------");
    } else {
      System.out.println("충전할 필요가 없습니다...");
      System.out.println("잔여 배터리..." + batteryCapacity + "%");
    }
  }
}

class Person {
  Phone phone;

  Person(Phone phone) {
    this.phone = phone;
    System.out.println("---");
    System.out.println("새 폰을 샀습니다!");
  }

  void buyNewPhone(Phone phone) {
    this.phone = phone;
    System.out.println("---");
    System.out.println("새 폰을 샀습니다!");
  }

  void turnOnPhone() {
    phone.powerOn();
  }

  void turnOffPhone() {
    phone.powerOff();
  }

  void watchUtube() {
    if (phone.isOn()) {
      phone.watchUtube();
    } else {
      System.out.println("폰이 꺼져 있어서 유튜브를 볼 수 없습니다.");
    }
  }

  void chargePhone() {
    phone.charge();
  }
}

public class Ex12_14 {
  public static void main(String[] args) {
    // Phone p = new Phone(); // 인터페이스는 객체 생성 불가!
    Phone p = new ApplePhone(); // 인터페이스는 타입으로 사용 가능(다형성)

    ApplePhone ap = new ApplePhone();
    ThreeStarPhone star = new ThreeStarPhone();
    Person kim1 = new Person(star);
    kim1.turnOnPhone();
    kim1.chargePhone();
    kim1.chargePhone();
    kim1.chargePhone();
    kim1.turnOnPhone();
    kim1.watchUtube();
    kim1.watchUtube();
    kim1.watchUtube();
    kim1.watchUtube();
    kim1.watchUtube();
    kim1.turnOffPhone();
    System.out.println("---");
    kim1.buyNewPhone(ap);
    kim1.turnOnPhone();
    kim1.chargePhone();
    kim1.chargePhone();
    kim1.chargePhone();
    kim1.turnOnPhone();
    kim1.watchUtube();
    kim1.watchUtube();
    kim1.watchUtube();
    kim1.watchUtube();
    kim1.watchUtube();
    kim1.turnOffPhone();
  }
}
