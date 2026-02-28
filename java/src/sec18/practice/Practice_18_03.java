package sec18.practice;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "초");
        }
    }
}

public class Practice_18_03 {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();
    }   
}
