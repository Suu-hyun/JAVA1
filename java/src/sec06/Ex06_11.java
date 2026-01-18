package sec06;

import java.util.Arrays;

public class Ex06_11 {
  public static void main(String[] args) {
    int[] arr01 = {1, 2, 3, 4};
    int[] arr02 = new int[arr01.length];

    // 얕은 복사
    for (int i = 0; i < arr01.length; i++) {
      arr02[i] = arr01[i];
    }

    arr02[1] = 0;
    
    System.out.println(Arrays.toString(arr01));
    System.out.println(Arrays.toString(arr02));
    System.out.println(arr01);
    System.out.println(arr02);
  }
}
