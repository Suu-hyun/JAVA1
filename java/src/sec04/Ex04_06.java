package sec04;

public class Ex04_06 {
    public static void main(String[] args) {
        int score = 70;

        // 90 이상 A
        if (score >= 90) {
            System.out.println("A");
        // 80 이상 B
        } else if (score >= 80) {
            System.out.println("B");
        // 70 이상 C
        } else if (score >= 70) {
            System.out.println("C");
        // 60 이상 D
        } else if (score >= 60) {
            System.out.println("D");
        // 그외 F
        } else {
            System.out.println("F");
        }
        
    }
}
