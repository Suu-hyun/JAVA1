package sec06;

import java.util.Arrays;

public class Ex06_15 {
  public static void main(String[] args) {
    int[][] arr01 = new int[2][3];

    arr01[0][0] = 1;
    arr01[0][1] = 2;
    arr01[0][2] = 3;
    arr01[1][0] = 10;
    arr01[1][1] = 20;
    arr01[1][2] = 30;

    int[][] arr02 = Arrays.copyOf(arr01, arr01.length);
    arr02[1][1] = 25;

    System.out.println(Arrays.toString(arr01[0]));
    System.out.println(Arrays.toString(arr01[1]));
    System.out.println("---");
    System.out.println(Arrays.toString(arr02[0]));
    System.out.println(Arrays.toString(arr02[1]));
  }
}
