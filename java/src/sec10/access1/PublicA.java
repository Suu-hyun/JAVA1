package sec10.access1;

public class PublicA {
  public int a;

  public PublicA(int a) {
    this.a = a;
  }

  private void printA() {
    System.out.println("private 테스트");
  }

  void runPrintA() {
    this.printA();
  }
}
