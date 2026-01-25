package sec09.practice;

public class Practice_09_05 {
  public static void main(String[] args) {
    Book b1 = new Book("어린왕자", 300);
    Book b2 = new Book(); // 기본 생성자가 필요함
  }
}

class Book {
  String title;
  int pages;

  Book() {}

  Book(String title, int pages) {
    this.title = title;
    this.pages = pages;
  }

}
