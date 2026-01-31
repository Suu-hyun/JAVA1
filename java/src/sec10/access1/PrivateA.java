package sec10.access1;

public class PrivateA {
  public static void main(String[] args) {
    PublicA pa = new PublicA(1);

    pa.runPrintA();
  }
}
