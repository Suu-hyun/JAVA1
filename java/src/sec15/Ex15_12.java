package sec15;

public class Ex15_12 {
    public static void main(String[] args) {
        String str = "Hello";
        str += " ";
        str += "World";
        str += "!";
        System.out.println(str);

        // strBuffer(), strBuilder() 사용 방법 동일
        // String 모다 메모리 사용 효율적
        // strBuffer()는 멀티 스레드 환경에서 유리
        StringBuffer strBuffer = new StringBuffer("Hello");
        strBuffer.append(" ");
        strBuffer.append("World");
        strBuffer.append("!");
        System.out.println(strBuffer);

        StringBuilder strBuilder = new StringBuilder("Hello");
        strBuilder.append(" ");
        strBuilder.append("World");
        strBuilder.append("!");
        System.out.println(strBuilder);
    }
}
