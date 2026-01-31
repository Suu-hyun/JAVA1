package sec10.book;

class Book {
  String title;
  String author;

  Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  final void info_title() {
    System.out.println("책 제목: " + title);
  }

  void info_author() {
    System.out.println("책 저자: " + author);
  }
}

class ComicBook extends Book {
  boolean isColor;

  ComicBook(String title, String author, boolean isColor) {
    super(title, author);
    this.isColor = isColor;
  }

// final 메서드는 오버라이딩 불가!
  // @Override
  // void info_title() {
  //   System.out.println("만화책 제목: " + title);
  //   if (this.isColor) {
  //     System.out.println("컬러입니다.");
  //   }
  // }

  @Override
  void info_author() {
    System.out.println("만화책 저자: " + author);
  }
}

public class Ex10_27 {
  public static void main(String[] args) {
    ComicBook book = new ComicBook("포켓몬", "미상",true);

    book.info_title();
    book.info_author();

    final int price = 1000;
    System.out.println(price);

    // price = 2000; // 재 할당 불가!
    // System.out.println(price);
  }
}
