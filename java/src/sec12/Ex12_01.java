package sec12;

// 추상 클래스
// 가이드 라인 제공 -> 표준화
// 추상 클래스는 클래스 앞에 abstract
// 추상 메서드는 메서드 앞에 abstract
// 추상 클래스는 객체 생성 못함!
// 추상 메서드가 1개 이상 존재하면 반드시 추상 클래스로 정의!
abstract class Animal {
  String name;

  Animal(String name) {
    this.name = name;
  }

  abstract void cry();
}

class Pig extends Animal {

  Pig(String name) {
    super(name);
  }

  @Override
  void cry() {
    System.out.println("꿀꿀");
  }
}

class Cow extends Animal {

  Cow(String name) {
    super(name);
  }

  @Override
  void cry() {
    System.out.println("음머");
  }
}

public class Ex12_01 {
  public static void main(String[] args) {
    // Animal a = new Animal(); // 추상 클래스는 객체 생성 불가!
    // a.cry();

    Animal p = new Pig("돼지");
    p.cry();
  }
}
