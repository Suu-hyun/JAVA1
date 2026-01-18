package sec06;

public class Ex06_19 {
  public static void main(String[] args) {
    int[] score = { 90, 92, 93 };

    int sum = 0;
    
    for (int num : score) {
      sum += num;
    }
    
    double avg = (double)sum / score.length;

    System.out.println("총점: " + sum);
    System.out.println("평균: " + avg);
  }
}
