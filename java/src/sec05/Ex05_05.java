package sec05;

public class Ex05_05 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            System.out.println(i);
            // sum = sum + i;
            sum += i;

            i++;
        }

        System.out.println("합: " + sum);

    }
}

// 코드 자동 정렬: alt + shift + f