package sec17;

// 함수형 인터페이스
// 람다식을 위한 인터페이스는 추상 매서드가 반드시 1개여야 함
// @FunctionalInterface을 붙이면 추상 메서드 2개 이상 작성 불가
@FunctionalInterface
interface CompareNumber {
    int compareTo(int num01, int num02);
}

public class Ex17_01 {
    public static void main(String[] args) {
        // 익명 클래스
        CompareNumber compare = new CompareNumber() {
            @Override
            public int compareTo(int num01, int num02) {
                return num01 > num02 ? 1 : num01 < num02 ? 2 : 0;
            }
        };

        System.out.println(compare.compareTo(10, 20));
        
        // 람다식 1
        // 익명 함수
        CompareNumber lambdaCompare = (int num01, int num02) -> {
            return num01 > num02 ? 1 : num01 < num02 ? 2 : 0;
        };

        System.out.println(lambdaCompare.compareTo(10, 20));
        
        // 람다식 2(매개변수 타입과 return 생략, 중괄호 생략)
        // 매개변수의 타입, return 키워드와 {} 생략 가능
        CompareNumber lambdaCompare2 = (num01, num02) -> num01 > num02 ? 1 : num01 < num02 ? 2 : 0;

        System.out.println(lambdaCompare2.compareTo(10, 20));
    }
}
