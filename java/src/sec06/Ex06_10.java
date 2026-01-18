package sec06;

import java.util.Arrays;

public class Ex06_10 {
  public static void main(String[] args) {
    int[] arr01 = {1, 2, 3};
    int[] arr02 = arr01; // 참조 할당
    arr02[1] = 0;
    
    System.out.println(Arrays.toString(arr01));
    System.out.println(Arrays.toString(arr02));

    System.out.println(arr01);
    System.out.println(arr02);
  }
}
