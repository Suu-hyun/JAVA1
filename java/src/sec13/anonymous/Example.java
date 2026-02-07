package sec13.anonymous;

abstract class Person {
  abstract void mySelf();
}

public class Example {
  public static void main(String[] args) {

    // 익명 클래스
    // 이름이 없기 때문에 딱 한번만 객체 생성
    Person student = new Person() {
      @Override
      void mySelf() {
        System.out.println("저는 학생입니다.");
      }
    };

    student.mySelf();
  }
}
