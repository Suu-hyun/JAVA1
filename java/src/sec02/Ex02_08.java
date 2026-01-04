package sec02;

public class Ex02_08 {
    public static void main(String[] args) {
        String address = "부산 서면";

        // System.out.println("저는 " + address + "에 살고 있습니다.");
        System.out.printf("저는 %s에 살고 있습니다.", address);
        System.out.println();

        // 변수명 작명 규칙
        // 1. camelcase
        String yourAddress = "부산 해운대";
        System.out.printf("당신은 %s에 살고 있습니다.", yourAddress);

        // 2. 영어 작성, 대소문자 구분함
        int num = 1;
        int NUM = 1;

        // 3. 숫자 사용 가능, 하지만 첫 글자로 숫자 사용 불가
        int num1 = 1;
        // int 1num = 1; // 오류 발생

        // 4. 특수문자 $, _만 사용 가능
        int $ = 1;
        int _number = 1;
        // int num# = 1; // 오류 발생

        //5. 자바 예약어 사용 불가
        // int public = 1; // 오류 발생
        int PUBLIC = 1;

        // 6. 변수명을 통해서 데이터의 용도를 이해할 수 있게 작명하는 것 권함
        int a = 1; // 좋지 않은 방식
        int myAddress = 1; // 권장 방식
    }    
}
// ctrl + enter: 다음 줄로 (코드 안 망가지게) 넘어감