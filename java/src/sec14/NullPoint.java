package sec14;

public class NullPoint {
  public static void main(String[] args) {
    String[] strArray = null;
    
    // 비체크 예외(Runtime Exection)
    System.out.println(strArray[0]); // NullPointerException
  }
}
