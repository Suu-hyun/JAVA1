package sec06;

import java.util.Arrays;

public class Ex06_07 {
  public static void main(String[] args) {
    int[] arr = {3, 2, 4, 5, 1};

    int temp = 0;

    for (int i = arr.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (arr[j] > arr[j+1]) {
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    // 배열 요소를 문자열로 출력
    System.out.println(Arrays.toString(arr));
  }
}
