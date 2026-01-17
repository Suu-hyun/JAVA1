package sec06;

import java.util.Arrays;
import java.util.Comparator;

public class Ex06_09 {
  public static void main(String[] args) {
    Integer[] arr = {3, 2, 4, 5, 1}; // wrapper 클래스 사용(기본 타입을 참조 타입으로 변환)

    // 내림차순 정렬
    Arrays.sort(arr, Comparator.reverseOrder());

    // 배열 요소를 문자열로 출력
    System.out.println(Arrays.toString(arr));
  }
}
