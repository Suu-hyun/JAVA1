package sec06;

import java.util.Arrays;

public class Ex06_16 {
  public static void main(String[] args) {
    int[][] arr = new int[5][5];
    int num = 1;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = num++;
      }
    }

    System.out.println(Arrays.toString(arr[0]));
    System.out.println(Arrays.toString(arr[1]));
    System.out.println(Arrays.toString(arr[2]));
    System.out.println(Arrays.toString(arr[3]));
    System.out.println(Arrays.toString(arr[4]));
  }
}
