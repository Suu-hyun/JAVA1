package sec07;

// 클래스 작명시 파스칼 케이스 사용함
public class Person {
  // 정적 멥버
  static String country = "한국";
  
  // 인스턴스 멤버(객체가 고유하게 가지는 속성과 기능)
  // 속성(필드, 인스턴스 변수)
  int age;
  char gender;
  double height;
  String address;
  String name;

  // 기능(메서드, 인스턴스 메서드)
  // 메서드 작명 카멜 케이스(동사로 시작)

  // 정적 메서드
  static void studyCoding() {
    System.out.println("자바 공부하기");
  }

  // 인스턴스 메서드
  void introduce() {
    System.out.printf("제 이름은 %s이고, 나이는 %d세이고, %s에 살고있습니다.\n", name, age, address);
  }
}
