package sec05;

public class Ex05_03 {
    public static void main(String[] args) {
        
        // 특수문자, 이모지 : win + .
        // 중첩 for 문
        // 초기화식 변수명: i j k m n...
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d × %d = %d\t", j, i, i * j);
            }

            System.out.println();
        }
    }
}
