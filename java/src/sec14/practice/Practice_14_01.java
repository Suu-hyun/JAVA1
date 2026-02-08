package sec14.practice;

public class Practice_14_01 {
    public static void main(String[] args) {
        try {
            int data = 10;
            double result = 0;
    
            result = data / 0;

            System.out.println("결과: " + result);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
