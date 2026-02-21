package sec15;

public class Ex15_11 {
    public static void main(String[] args) {
        String str = "901234-1234567";

        System.out.println(str.substring(8)); // 234567
        // endIndex는 포함되지 않으므로 주의!
        System.out.println(str.substring(0, 8)); // 901234-1
        System.out.println(str.substring(0, 8) + "******"); // 901234-1******

        if (str.substring(7, 8).equals("1")) {
            System.out.println("남자");
        } else {
            System.out.println("여자");   
        }

    }
}
