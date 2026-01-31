package sec11;

class Animal {}
class Pig extends Animal {}

public class Ex11_16 {
  public static void main(String[] args) {
    Pig p1 = new Pig();

    // 객체 instanceof 타입
    // 어떤 객체가 어떤 타입인지 확인(상속 관계라면 부모 클래스의 타입이기도 함)
    System.out.println(p1 instanceof Pig); // true
    System.out.println(p1 instanceof Animal); // true

    Animal a = p1; // p1은 Animal의 인스턴스 이므로 자동 형변환 가능

    Pig p2 = (Pig) a;
    System.out.println(p2 instanceof Animal); // true

    Animal a1 = new Animal();
    System.out.println(a1 instanceof Pig); // false
  }
}
