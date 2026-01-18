package sec06;

import java.util.Arrays;

public class Ex06_14 {
  public static void main(String[] args) {
    int[][] arr = new int[3][];

    arr[0] = new int[2];
    arr[1] = new int[3];
    arr[2] = new int[1];

    arr[1][1] = 1;
    
    System.out.println(Arrays.toString(arr[0]));
    System.out.println(Arrays.toString(arr[1]));
    System.out.println(Arrays.toString(arr[2]));
  }
}
