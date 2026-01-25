package sec10;

public class Ex10_09 {
  public static void main(String[] args) {
    Computer c = new Computer();
    c.powerOn();
    c.powerOff();

    System.out.println("---");

    SamsongComputer samsong = new SamsongComputer();
    samsong.powerOn();
    samsong.powerOff();
  }
}
