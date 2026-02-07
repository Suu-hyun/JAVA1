package sec13.access;

class PermitExam {
  interface InnerInterface {
    void print();
  }

  private class InnerClass implements InnerInterface {
    @Override
    public void print() {
      System.out.println("접근을 private로 제한");
    }
  }

  InnerClass getInnerClass() {
    return new InnerClass();
  }
}

public class PermitExamMain {
  public static void main(String[] args) {
    PermitExam permit = new PermitExam();
    PermitExam.InnerInterface innerClass = permit.getInnerClass();
    innerClass.print();
  }
}
