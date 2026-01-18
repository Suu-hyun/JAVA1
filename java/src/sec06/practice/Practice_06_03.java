package sec06.practice;

import java.util.Arrays;

public class Practice_06_03 {
  public static void main(String[] args) {
    int[] cards = new int[10];

    for (int i = 0; i < cards.length; i++) {
      cards[i] = (int) (Math.random() * 10) + 1;

      for (int j = 0; j < i; j++) {
        if (cards[j] == cards[i]) {
          i--;
          break;
        }
      }
    }

    System.out.println(Arrays.toString(cards));
  }
}
