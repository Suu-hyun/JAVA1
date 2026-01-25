package sec10.access2;

import sec10.access1.PublicA;

public class PublicB {
  public static void main(String[] args) {
    // public 접근 제한자는 모든 패키지 접근 가능
    PublicA a = new PublicA(1);
    System.out.println(a.a);
  }
}
