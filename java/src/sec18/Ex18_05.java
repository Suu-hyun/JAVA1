package sec18;


class BankSync {
    private int money;

    int getMoney() {
        return money;
    }

    // 메서드 동기화 처리(스레드가 차례를 기다려서 순서대로 처리하도록 함)
    // synchronized void setMoney(int money) {
    //     this.money += money;
    // }

    synchronized void setMoney(int money) {
        this.money += money;
    }
}

class AddThreadSync implements Runnable {
    private BankSync bank;
    private String name;

    AddThreadSync(String name, BankSync bank) {
        this.name = name;
        this.bank = bank;
    }

    @Override
    public void run() {
        // 블럭 동기화
        synchronized (bank) {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    bank.setMoney(1000);
                    System.out.println(this.name + " 현재 잔고 : " + bank.getMoney());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Ex18_05 {
    public static void main(String[] args) {
        BankSync bank = new BankSync();

        Thread thread1 = new Thread(new AddThreadSync("1번", bank));
        thread1.start();

        Thread thread2 = new Thread(new AddThreadSync("2번", bank));
        thread2.start();

        Thread thread3 = new Thread(new AddThreadSync("3번", bank));
        thread3.start();
    }
}
