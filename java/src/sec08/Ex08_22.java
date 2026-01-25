package sec08;

public class Ex08_22 {
  public static void main(String[] args) {
    Person kim1 = new Person();
    kim1.setAge(99);
    System.out.println("김일남씨의 나이는 " + kim1.getAge() + "세입니다.");
    
    kim1.setAge(-99);
    System.out.println("김일남씨의 나이는 " + kim1.getAge() + "세입니다.");
  }
}
