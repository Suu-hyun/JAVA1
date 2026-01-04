package sec02;

public class Ex02_10 {
    public static void main(String[] args) {
        int myAge = 20;
        int yourAge = 30;

        //swap 알고리즘
        int temp = myAge;
        
        myAge = yourAge;
        yourAge = temp;

        System.out.printf("제 나이는 %d세 입니다.\n", myAge);
        System.out.printf("당신의 나이는 %d세 입니다.\n", yourAge);
    }
}
