package sec11;

class Computer {
  void powerOn() {
    System.out.println("삑~ 컴퓨터가 켜졌습니다.");
  }

  void powerOff() {
    System.out.println("컴퓨터가 종료됩니다.");
  }
}

class Samsong extends Computer {
  @Override
  void powerOn() {
    super.powerOn();
    System.out.println("아리 러브 삼송");
  }
}

class Lz extends Computer {
  @Override
  void powerOn() {
    super.powerOn();
    System.out.println("아리 러브 Lz");
  }
}

class ComputerRoom {
  Computer computer2;
  Computer computer1;

  void allPowerOn() {
    this.computer1.powerOn();
    this.computer2.powerOn();
  }

  void allPowerOff() {
    this.computer1.powerOff();
    this.computer2.powerOff();
  }
}

public class Ex11_12 {
  public static void main(String[] args) {
    ComputerRoom cRoom = new ComputerRoom();

    cRoom.computer1 = new Samsong();
    cRoom.computer2 = new Lz();

    cRoom.allPowerOn();
    cRoom.allPowerOff();

  }
}
