package sec08.practice;

public class Practice_08_05 {
  public static void main(String[] args) {
    Person lee = new Person();
    lee.setAge(-10);
    lee.setAge(30);
    System.out.println("lee의 나이는 " + lee.getAge() + "세입니다.");


  }
}

class Person {
  private int age;

  void setAge(int num) {
    if (num <= 0) {
      System.out.println("잘못된 수를 입력하셨습니다. 1 이상의 값으로 설정하세요.");
    }
    age = num;
  }

  int getAge() {
    return age;
  }
}
