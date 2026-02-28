package sec18;

public class Ex18_03 {
    public static void main(String[] args) {
        Thread whiteFlag = new Thread(() -> {
        try {
            while(true) {
                Thread.sleep(1000);
                System.out.println("백기 올려");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    });

        Thread blueFlag = new Thread(() -> {
        try {
            while(true) {
                Thread.sleep(1000);
                System.out.println("청기 올려");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    });

        whiteFlag.start();
        blueFlag.start();
    }
}
