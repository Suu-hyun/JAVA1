package sec07;

public class Ex07_13 {
  public static void main(String[] args) {
    // 정적 멤버는 객체 생성 없이 클래스로 바로 접근(호출) 가능
    System.out.println(Student.schoolName);
    Student.goToSchool();
  }
}
