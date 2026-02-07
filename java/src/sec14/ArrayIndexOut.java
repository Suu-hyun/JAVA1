package sec14;

public class ArrayIndexOut {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };
    System.out.println(arr[3]); // ArrayIndexOutOfBoundsException
  }
}
