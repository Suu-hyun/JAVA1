package sec17.practice;

@FunctionalInterface
interface Compare {
    String compare(int num01, int num02);
}

public class Practice_17_04 {
    public static void main(String[] args) {
        
        int num01 = 20;
        int num02 = 30;

        Compare comp = (n1, n2) -> "두 수 " + n1 + "과 " + n2 + "중 " + (n1 > n2 ? n1 : n2) + "이 더 큽니다.";

        System.out.println(comp.compare(num01, num02));
    }
}
