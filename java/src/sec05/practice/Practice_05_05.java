package sec05.practice;

// ---* // - 3, *- 1
// --*-* // - 2, *- 2
// -* * * // - 1, *- 3
// * * * * // - 0, *- 4

public class Practice_05_05 {
  public static void main(String[] args) {

    for (int i = 0; i < 4; i++) {
      for (int j = 3 - i; j > 0; j--) {
        System.out.print(" ");
      }
      for (int j = 0; j < i+1; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}
