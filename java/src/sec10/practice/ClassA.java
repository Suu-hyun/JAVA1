package sec10.practice;

public class ClassA {
  private int a;

  // private ClassA(int a) { // private 생성자는 객체 생성 불가
  ClassA(int a) { // default 접근 제한자 적용한 생성자
    this.a = a;
  }

  public void methodA() {
    System.out.println("필드 a의 값: " + a);
  }
}
