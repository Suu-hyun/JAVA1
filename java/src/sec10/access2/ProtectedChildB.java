package sec10.access2;

import sec10.access1.ProtectedA;

public class ProtectedChildB extends ProtectedA {
  void accessTest() {
    super.ProtectedAmethod();
  }
}
