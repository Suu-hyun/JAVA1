package sec06;

public class Ex06_04 {
  public static void main(String[] args) {
    int[] arr = new int[10];

    System.out.println(arr.length);

    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 100) + 1;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ", ");
    }
  }
}
