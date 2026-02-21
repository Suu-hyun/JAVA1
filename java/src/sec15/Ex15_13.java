package sec15;

public class Ex15_13 {
    public static void main(String[] args) {
        double num = 3.14159265358979;

        System.out.println(num);
        System.out.println(Math.ceil(num));
        System.out.println(Math.ceil(num * 10) / 10); // 3.2
        System.out.println(Math.ceil(num * 100) / 100); // 3.15

        System.out.println("---");

        System.out.println(Math.floor(num));
        System.out.println(Math.floor(num * 10) / 10); // 3.1
        System.out.println(Math.floor(num * 100) / 100); // 3.14

        System.out.println("---");

        System.out.println(Math.round(num));
        System.out.println(Math.round(num * 10) / 10.0); // 3.1
        System.out.println(Math.round(num * 100) / 100.0); // 3.14
        System.out.println(Math.round(num * 1000) / 1000.0); // 3.142

        System.out.println("---");
        
        System.out.println(Math.abs(-1.234)); // 1.234
        
        System.out.println("---");

        // 최대값(최솟값)은 2개의 값에 대해서만 구할 수 있음
        System.out.println(Math.max(1.9, 2));
        // 3개 이상의 값에 대한 최대값 구하기
        System.out.println(Math.max(1.9, Math.max(2, 2.9)));

        
        System.out.println(Math.min(1.9, 2));
        // 3개 이상의 값에 대한 최솟값 구하기
        System.out.println(Math.min(1.9, Math.min(2, 2.9)));
    }
}
