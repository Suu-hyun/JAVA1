package sec11;

class Parent {}
class Child extends Parent {}

public class Ex11_01 {
  public static void main(String[] args) {
    // 사용자 정의 타입
    Parent p = new Parent();
    Child c = new Child();

    // 상속 관계에서
    // 자식 타입에서 부모 타입으로 형변환은 자동
    // 부모 타입에서 자식 타입으로 형변환은 강제
    Parent p2 = c; // 자동 형변환
    Child c3 = (Child) p2; // 강제 형변환

    // 런타임 오류 발생
    // 부모 생성자로 생성한 객체가 자식 타입으로 형변환 불가!
    // Child c4 = (Child) p;

    Parent p3 = new Child(); // 자동 형변환

    System.out.println(p);
    System.out.println(c);
  }
}
