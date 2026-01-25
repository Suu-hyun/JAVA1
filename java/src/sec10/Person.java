package sec10;

public class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

class Customer extends Person {
  int memberId;
  
  Customer(String name, int age, int memberId) {
    super(name, age);
    this.memberId = memberId;
  }

  void enter() {
    System.out.printf("이름(%d세): %s\n", this.age, this.name);
    System.out.println("회원ID " + this.memberId + " 입장하십니다!");
  }
}