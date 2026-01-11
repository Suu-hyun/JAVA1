package sec04;

public class Ex04_11 {
    public static void main(String[] args) {
        String fruit = "mango";

        //Java 12 이상 스위치 표현식(Switch Expression)
        int price = switch (fruit) {
            case "apple", "mango" -> 2000;
            case "banana"-> 3000;
            default -> 0;
        };

        System.out.printf("%s의 가격: %d원", fruit, price);
    }
}
