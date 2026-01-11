package sec05;

public class Ex05_04 {
    public static void main(String[] args) {
        System.out.println("------*"); // - 6, * 1
        System.out.println("-----***"); // - 5, * 3
        System.out.println("----*****"); // - 4, * 5
        System.out.println("---*******"); // - 3. * 7
        System.out.println("--*********"); // - 2, * 9
        System.out.println("-***********"); // - 1, * 11
        System.out.println("*************"); // - 0, * 13

        System.out.println();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }

            System.out.println();
        }    
    }
}
