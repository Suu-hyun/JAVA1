package sec03;

public class Ex03_15 {
    public static void main(String[] args) {
        // 논리 연산자
        // 평가 결과는 논리형(true, false)
        // && || ^

        // &&(and)
        // false가 하나라도 있으면 false
        System.out.println(true && true); // true
        System.out.println(false && true); // false // 단축 평가 결과
        System.out.println(true && false); // false
        System.out.println(false && false); // false

        // || (or)
        // true가 하나라도 있으면 true
        System.out.println(true || true); // true
        System.out.println(false || true); // true
        System.out.println(true || false); // true
        System.out.println(false || false); // false

        // ^ (xor: 배타적 논리합 exclusive or)
        // true가 하나라도 있으면 true, 둘 다 true면  false
        System.out.println(true ^ true); // false
        System.out.println(false ^ true); // true
        System.out.println(true ^ false); // true
        System.out.println(false ^ false); // false


    }
}
