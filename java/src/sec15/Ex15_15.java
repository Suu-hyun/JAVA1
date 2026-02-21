package sec15;

public class Ex15_15 {
    public static void main(String[] args) {
        String score = "60";
        String myScroe = "59.5";

        // 문자열 변환
        // Wrapper 클래스의 parse 메서드 사용하여 변환
        int scoreNew = Integer.parseInt(score);
        double myScore = Double.parseDouble(myScroe);

        if (myScore >= scoreNew) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
    }
}
