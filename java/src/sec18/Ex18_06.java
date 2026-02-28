package sec18;

public class Ex18_06 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        System.out.println("생성 : " + thread.getState());
        
        thread.start();
        System.out.println("호출 : " + thread.getState());
        
        try {
            Thread.sleep(1000);
            System.out.println("일시 정지 : " + thread.getState());
            
            thread.join();
            System.out.println("종료 : " + thread.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
