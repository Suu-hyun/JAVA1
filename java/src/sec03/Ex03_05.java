package sec03;

public class Ex03_05 {
    public static void main(String[] args) {
        int num = 10;
        // 전위, 후위에 따라 결과 달라짐
        // 이유: 실행 순서
        // 뒤 == 후위 == postfix
        System.out.println(num++); // 10
        System.out.println(num); // 11
        // 앞 == 전위 == prefix
        System.out.println(++num); // 12
    }
}
