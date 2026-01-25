package sec10.access2;

import sec10.access1.ProtectedA;

public class ProtectedChildA extends ProtectedA{
  public static void main(String[] args) {
    ProtectedChildA p = new ProtectedChildA();
    p.ProtectedAmethod(); // protected는 다른 패키지라도 상속 관계이면 접근 가능

    ProtectedChildB b = new ProtectedChildB();
    b.accessTest();
  }
}
