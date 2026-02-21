package sec15.practice;

public class Practice_15_02 {
    public static void main(String[] args) {
        String sentence1 = "사과";
        String sentence2 = new String("사과");
        String sentence3 = "망고";

        // 객체 비교
        System.out.println(sentence1 == sentence2); // false
        System.out.println(sentence2 == sentence3); // false

        System.out.println(System.identityHashCode(sentence1));
        System.out.println(System.identityHashCode(sentence2));
        System.out.println(System.identityHashCode(sentence3));

        // 값 비교
        System.out.println(sentence1.equals(sentence2)); // true
        System.out.println(sentence1.equals(sentence3)); // false
        System.out.println(sentence2.equals(sentence3)); // false
    }
}
