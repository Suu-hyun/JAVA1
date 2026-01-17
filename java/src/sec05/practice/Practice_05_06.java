package sec05.practice;

// ------*-       // -- 3, *- 1
// ----*-*-*-     // -- 2, *- 3
// --*-*-*-*-*-   // -- 1, *- 5
// *-*-*-*-*-*-*- // -- 0, *- 7

public class Practice_05_06 {
  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
      for (int j = 3 - i; j > 0; j--) {
        System.out.print("  ");
      }
      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}
