package sec06;

public class Ex06_17 {
  public static void main(String[] args) {
    // ==, equals() 메서드 차이점
    String str1 = "123";
    String str2 = "123";
    String str3 = new String("123");
    String str4 = new String("123");
    
    // System.out.println(str1);
    // System.out.println(str3);

    // 주소 비교
    System.out.println(str1 == str2); // true
    System.out.println(str1 == str3); // false
    System.out.println(str3 == str4); // false

    // System.out.println(System.identityHashCode(str1));
    // System.out.println(System.identityHashCode(str2));
    // System.out.println(System.identityHashCode(str3));
    // System.out.println(System.identityHashCode(str4));

    // 값 비교
    System.out.println(str1.equals(str2));
    System.out.println(str1.equals(str3));
    System.out.println(str3.equals(str4));
  }
}
