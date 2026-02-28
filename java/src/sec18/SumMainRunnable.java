package sec18;

class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += (i+1);
        }

        System.out.println("sum = " + sum);
        String threadName = Thread.currentThread().getName();
        System.out.println("현재 스레드: " + threadName);
    }
}

public class SumMainRunnable {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyThreadRunnable());
        myThread.start();
    }
}
