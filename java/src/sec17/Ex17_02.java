package sec17;

@FunctionalInterface
interface StrConcat {
    String concat(String str1, String str2);
}

public class Ex17_02 {
    public static void main(String[] args) {
        // 익명 클래스
        // StrConcat strConcat = new StrConcat() {
        //     @Override
        //     public String concat(String str1, String str2) {
        //         return (str1 + "! " + str2);
        //     }
        // };

        
        // 람다식
        StrConcat strConcat = (str1, str2) -> str1 + "! " + str2;
        System.out.println(strConcat.concat("Hello", "World"));

        // 람다식과 외부변수
        String str = "";
        StrConcat strConcat2 = (str1, str2) -> {
            // str += str1 + "1 " + str2; // 외부 변수의 값 변경 불가
            return str1 + "! " + str2;
        };
    }
}
