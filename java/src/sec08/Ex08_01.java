package sec08;

public class Ex08_01 {

  static void method01() {
    System.out.println("인수 X, 반환 값 X");
  }

  static void method02(String str) { // 매개 변수
    System.out.println(str);
  }

  static String method03() {
    return "인수 X, 반환 값 O";
  }

  static String method04(String str) {
    return "인수 O, 반환 값 O";
  }
  public static void main(String[] args) {
    Ex08_01.method01();
    Ex08_01.method02("인수 O, 반환 값 X");
    System.out.println(Ex08_01.method03());
    System.out.println(Ex08_01.method04("인수 O, 반환 값 O"));
  }
}
