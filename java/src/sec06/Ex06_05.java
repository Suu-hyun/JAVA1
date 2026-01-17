package sec06;

public class Ex06_05 {
  public static void main(String[] args) {
    char[] cards = {'1', 'L', '2', 'O', '3', 'V', '4', 'E', '5'};

    for (int i = 0; i < cards.length; i++) {
      if (cards[i] >= 65 && cards[i] <= 90) {
        System.out.print(cards[i]);
      }
    }
  }
}
