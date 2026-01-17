package sec06;

public class Ex06_01 {
  public static void main(String[] args) {
    int[] arr;

    // 초기화시 크기 지정, 초기화 후 변경 크기 변경 불가
    arr = new int[5];

    System.out.println(arr); // [I@2ff4acd

    System.out.println(arr[0]);

    arr[0] = 1;
    System.out.println(arr[0]);

    // 지정된 자료형의 값만 저장 가능
    // arr[0] = 1.234; // 불가
  }
}
