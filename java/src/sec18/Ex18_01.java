package sec18;

public class Ex18_01 {
    public static void main(String[] args) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);

        Thread.currentThread().setName("NewMain");
        System.out.println(Thread.currentThread().getName());
    }
}
