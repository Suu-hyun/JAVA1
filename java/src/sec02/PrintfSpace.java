package sec02;

public class PrintfSpace {
    public static void main(String[] args) {
        System.out.printf("%5d", 1);
        System.out.println(); // 줄바꿈 기능
        System.out.printf("%5d", 12);
        System.out.println();
        System.out.printf("%5d", 123);
        System.out.println();
        System.out.printf("%5d", 1234);
        System.out.println();
        System.out.printf("%5d", 12345);
        System.out.println();
        System.out.println("---");
        System.out.printf("%-5d", 1);
        System.out.println();
        System.out.printf("%-5d", 12);
        System.out.println();
        System.out.printf("%-5d", 123);
        System.out.println();
        System.out.printf("%-5d", 1234);
        System.out.println();
        System.out.printf("%-5d", 12345);
    }
}
