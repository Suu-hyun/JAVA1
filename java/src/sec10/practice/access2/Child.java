package sec10.practice.access2;

import sec10.practice.access1.Parent;

public class Child extends Parent {
  void accessParentMethod() {
    super.parentMethod();
    System.out.println("accessparentMethod 호출");
  }

  public static void main(String[] args) {
    Child c = new Child();
    c.accessParentMethod();
  }
}
