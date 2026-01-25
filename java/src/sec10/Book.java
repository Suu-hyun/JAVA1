package sec10;

public class Book {
  String title;
  int price;

  void info() {
    System.out.println("책의 제목은 " + title + "이고, 가격은 " + price + "원입니다.");
  }
}

class ComicBook extends Book {
  boolean isColor;

  void info() {
    System.out.println("책의 제목은 " + title + "이고, 가격은 " + price + "원입니다.");
    if (isColor) {
      System.out.println("이 책은 컬러입니다.");
    }
  }
}
