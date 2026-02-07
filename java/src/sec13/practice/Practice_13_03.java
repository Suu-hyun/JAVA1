package sec13.practice;

class MyCar {
  private int price;
  private String myName;

  MyCar(String myName, int price) {
    this.myName = myName;
    this.price = price;
  }

  String getInfo() {
    return "차량: " + myName + ", 가격: " + price;
  }

  class Promotion {
    int discount() {
      int discount = 0;
      discount = price / 100;
      return discount;
    }
  }
}

public class Practice_13_03 {
  public static void main(String[] args) {
    MyCar mycar = new MyCar("소나타", 5000);
    MyCar.Promotion promotion = mycar.new Promotion();

    System.out.println(mycar.getInfo() + ", 할인금액: " + promotion.discount());
  }
}
