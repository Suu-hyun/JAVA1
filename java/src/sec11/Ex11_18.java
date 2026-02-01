package sec11;

class P {
  void method() {
    System.out.println("P기능");
  }
}

class A extends P {
  @Override
  void method() {
    System.out.println("A기능");
  }
}

class B extends P{
  @Override
  void method() {
    System.out.println("B기능");
  }

  void method(String name) {
    System.out.println(name + "기능(오버라이딩)");
  }

  void method(String name, int count) {
    System.out.println(name + "기능(오버라이딩)" + count + "번");
  }
}

class C extends B {}


public class Ex11_18 {
  public static void main(String[] args) {
    P p = new P();
    p.method();

    // A a = new A();
    P a = new A();
    a.method();

    B b = new B();
    b.method();
    b.method("B");
    b.method("B", 1);

    C c = new C();
    c.method("C", 2);
  }
}
