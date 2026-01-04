package sec02;

public class PrintfPt {
    public static void main(String[] args) {
        System.out.printf("%f", 0.1234567); // 소수점 6자리까지 출력하고 나머지는 반올림을 함
        System.out.println();
        System.out.printf("%.1f", 0.1234567);
        System.out.println();
        System.out.printf("%.2f", 0.1234567);
        System.out.println();
        System.out.printf("%.3f", 0.1234567);
        System.out.println();
        System.out.printf("%.4f", 0.1234567);
        System.out.println();
    }
}
// alt + 방향키로 이동가능
// ctrl + shift + k: 선택된 코드 열 지우기
// 선택된 코드 열 복사: alt + shift + 방향키 아래로
// 특정 코드 동시 선택: ctrl + d