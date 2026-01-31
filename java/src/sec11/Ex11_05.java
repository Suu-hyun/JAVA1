package sec11;

class Calendar {
  String color;
  int months;

  Calendar(String color, int months) {
    this.color = color;
    this.months = months;
  }

  void info() {
    System.out.printf("%s 달력은 %d월까지 있습니다.\n", color, months);
  }

  void hanging() {
    System.out.println(color + " 달력을 벽에 걸 수 있습니다.");
  }
}

class DeskCalendar extends Calendar {
  DeskCalendar(String color, int months) {
    super(color, months);
  }

  @Override
  void hanging() {
    System.out.println(color + " 달력을 벽에 걸려면 고리가 필요합니다.");
  }

  void onTheDesk() {
    System.out.println(color + " 달력을 책상에 세울 수 있습니다.");
  }
}

public class Ex11_05 {
  public static void main(String[] args) {
    DeskCalendar d = new DeskCalendar("보라색", 6);
    // d.info();
    // d.hanging();
    // d.onTheDesk();

    Calendar d2 = d; // 자동 형변환
    d2.info();
    d2.hanging(); // 오버라이딩된 메서드가 최우선으로 호출됨!
    // d2.onTheDesk(); // Calendar 없는 메서드라서 호출 불가!

    Calendar d3 = new DeskCalendar("검은색", 12); // 자동 형변환
    d3.info();
    d3.hanging();

    DeskCalendar d4 = (DeskCalendar) d3; // 강제 형변환
    d4.info();
    d4.hanging();
    d4.onTheDesk();

  }
}
