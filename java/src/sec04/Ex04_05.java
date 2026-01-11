package sec04;

public class Ex04_05 {
    public static void main(String[] args) {
        // 여럿 중 하나
        int num = 0;

        if (num > 0) {
            System.out.println("양수");
        } else if (num < 0) {
            System.out.println("음수");
        } else {
            System.out.println(num);
        }
    }
}
