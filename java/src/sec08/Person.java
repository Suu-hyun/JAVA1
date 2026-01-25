package sec08;

public class Person {
  private int age;

  void setAge(int a) {
    // 유효성 검사
    if (a <= 0) {
      System.out.println("나이를 다시 입력해 주세요!");
      return;
    }

    age = a;
  }

  int getAge() {
    return age;
  }
}
