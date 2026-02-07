package sec13.static_inner_class;

class PrintOut {
  // 정적 내부 클래스
  static class Out {
    void println(String str) {
      System.out.println(str);
    }
  }
}

public class StaticClassExam {
  public static void main(String[] args) {
    // PrintOut po = new PrintOut();
    // PrintOut.Out innerOut = po.new Out();
    // innerOut.println("인스턴스 내부 클래스의 메서드 호출");
    
    PrintOut.Out innerOut = new PrintOut.Out(); // 외부 클래스 객체 생성없이 객체 생성 가능
    innerOut.println("정적 내부 클래스의 메서드 호출");
  }
}
