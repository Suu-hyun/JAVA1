package sec18;

class Bank {
    private int money;

    int getMoney() {
        return money;
    }

    void setMoney(int money) {
        this.money += money;
    }
}

class AddThread implements Runnable {
    private Bank bank;
    private String name;

    AddThread(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }

    @Override
    public void run() {
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

public class Ex18_04 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // 스레드는 비동기 방식으로 동작함
        Thread thread1 = new Thread(new AddThread("1번", bank));
        thread1.start();

        Thread thread2 = new Thread(new AddThread("2번", bank));
        thread2.start();

        Thread thread3 = new Thread(new AddThread("3번", bank));
        thread3.start();
    }
}
