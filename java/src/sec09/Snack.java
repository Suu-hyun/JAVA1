package sec09;

public class Snack {
  int price;
  String name;

  Snack() {}
  
  Snack(int price) {
    this.price = price;
  }

  Snack(int price, String name) {
    this.price = price;
    this.name = name;
  }
  
  // 매개 변수의 순서가 다르면 다른 생성자로 간주
  Snack(String name, int price) {
    // this.price = price;
    // this.name = name;
    this(price, name);
  }

  // 매개 변수의 타입의 순서가 같으면 중복 생성자 정의로 간주(컴파일 오류)
  // Snack(String n1, int p1) {
  //   price = p;
  //   name = n;
  // }

  
  void info() {
    // System.out.println("과자의 가격은 " + price + "원입니다.");
    System.out.println(name + "과자의 가격은 " + price + "원입니다.");
  }
}
