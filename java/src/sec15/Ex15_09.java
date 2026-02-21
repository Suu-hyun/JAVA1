package sec15;

public class Ex15_09 {
    public static void main(String[] args) {
        String str = "Hello Java Hello Java";

        // indexOf()는 찾은 문자열의 인덱스 반환
        // 문자열의 왼쪽부터 검색
        // 가장 먼저 찾은 문자열의 인덱스 반환
        System.out.println(str.indexOf("Hello")); // 0
        System.out.println(str.indexOf("Java")); // 6
        System.out.println(str.indexOf("J")); // 6
        // 검색 시작 인덱스를 지정할 수 있음
        System.out.println(str.indexOf("Hello", 2)); // 11
        // 찾는 문자열이 없는 경우 -1 반환
        System.out.println(str.indexOf("Python")); // -1
    }
}
