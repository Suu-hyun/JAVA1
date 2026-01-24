package sec07;

public class Ex07_03 {
  public static void main(String[] args) {
    Person kim1 = new Person();
    
    Person james = new Person();
    james.country = "미국";
    
    System.out.println(kim1.country);
    System.out.println(james.country);

    // 정적 멤버는 클래스로 직접 접근하는 방식 사용 권장
    System.out.println(Person.country);

    Person.studyCoding();
  }
}
