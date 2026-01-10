package sec03;

public class Ex03_01 {
    public static void main(String[] args) {
        // 단항 연산자 +, - (양수, 음수)
        int x = 100;
        int resultPlus = +x;
        int resultMinus = -x;
        int resultMinusMinus = -resultMinus;

        System.out.println(resultPlus);
        System.out.println(resultMinus);
        System.out.println(resultMinusMinus);
    }
}
