package sec15;

public class Ex15_14 {
    public static void main(String[] args) {
        // Integer num01 = new Integer(10);
        Integer num01 = Integer.valueOf(10);
        System.out.println(num01);

        Double num02 = Double.valueOf(10.123);
        System.out.println(num02);
        
        int num03 = num01; // 오토 언박싱
        System.out.println(num03);

        double num04 = num02;
        System.out.println(num04);

        Double num05 = num04; // 오토 박싱
        System.out.println(num05);

    }
}
