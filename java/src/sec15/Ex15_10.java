package sec15;

public class Ex15_10 {
    public static void main(String[] args) {
        String str = "자바 프로그래밍은 어렵지만 자바를 배울수록 재미있습니다.";
        String strNew = str.replace("자바", "Java");
        System.out.println(strNew);

        // replaceAll() 메서드는 첫번째 인수로 정규 표현식 사용 가능
        String phoneNumber = "01012345678";
        String phoneNumberNew = phoneNumber.replaceAll("(\\d{3})(\\d{4})(\\d{4})", "$1-$2-$3");  
        System.out.println(phoneNumberNew);
    }
}
