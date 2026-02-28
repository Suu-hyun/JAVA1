package sec18;

class WhiteFlag implements Runnable {
    @Override
    public void run() {
        try {
            while(true) {
                Thread.sleep(1000); // 1초 대기
                System.out.println("백기 올려");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class BlueFlag implements Runnable {
    @Override
    public void run() {
        try {
            while(true) {
                Thread.sleep(1000);
                System.out.println("청기 올려");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Ex18_02 {
    public static void main(String[] args) {
        Thread white = new Thread(new WhiteFlag());
        Thread Blue = new Thread(new BlueFlag());
        white.start();
        Blue.start();
    }
}
