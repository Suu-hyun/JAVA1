package sec08;

public class Ex08_19 {

  static void stop() {
    while (true) {
      System.out.println("return으로 종료하기");
      return;
    }
  }
  
  public static void main(String[] args) {
    Ex08_19.stop();
  }
}
