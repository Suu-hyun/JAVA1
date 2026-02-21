package sec15;

import java.util.Calendar;
import java.util.Scanner;

public class Ex15_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calendar cal = Calendar.getInstance();

        System.out.print("연도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();
        
        cal.set(year, month - 1, 1);
        
        // System.out.println(cal);

        int lastOfDate = cal.getActualMaximum(Calendar.DATE);
        int week = cal.get(Calendar.DAY_OF_WEEK);
        // System.out.println(week);

        System.out.println("일\t월\t화\t수\t목\t금\t토");
        
        for (int i = 1; i < week; i++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= lastOfDate; i++) {
            System.out.print(i + "\t");

            if (week % 7 == 0) {
                System.out.println();
            }

            week++;
        }

        scanner.close();
    }
}
