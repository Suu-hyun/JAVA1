package sec10.access1;

import sec10.access1.DefaultB;

public class DefaultB {
  public static void main(String[] args) {
    DefaultA b = new DefaultA(1); // 생성자에 default 접근 제한 처리되어 있음. 동일 패키지 내라서 접근 가능!
    System.out.println(b.a);
  }
}
