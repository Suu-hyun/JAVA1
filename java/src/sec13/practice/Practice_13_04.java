package sec13.practice;

class InnerExam {
  int plus(int value) {
    // int value2 = 2;
    
    class Cal {
      int add() {
        // return value++; // 지역 클래스 밖의 변수 값은 변경 불가능!
        return value;
      }
    }

    Cal cal = new Cal();
    return cal.add();
  }
}

public class Practice_13_04 {
  public static void main(String[] args) {
    
  }
}
