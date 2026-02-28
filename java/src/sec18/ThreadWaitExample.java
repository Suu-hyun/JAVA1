package sec18;

import java.net.Socket;

class Storage {
    private int stackCount = 10;
    
    synchronized void addStack(int stackCount) {
        this.stackCount += stackCount;

        if (this.stackCount >= 10) {
            System.out.println("--- 스레드 깨우기 ---");
            notify();
        }
    }

    synchronized void popStack(int leaveCount) {
        try {
            if (leaveCount > this.stackCount) {
                this.stackCount = 0;
            } else {
                this.stackCount -= leaveCount;
            }
    
            if (this.stackCount == 0) {
                System.out.println("--- 옮길 짐 없음 (대기) ---");
                wait();
                System.out.println("--- 옮길 짐 있음 ---");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    int getStackCount() {
        return this.stackCount;
    }
}

class AddStackThread extends Thread {
    private Storage storage;

    AddStackThread(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        try{
            while(true) {
                Thread.sleep(1000);
                if (this.storage.getStackCount() == 0) {
                    System.out.println("짐 10개 추가");
                    this.storage.addStack(10);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class PopStackThread extends Thread {
    private Storage storage;

    PopStackThread(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        try {
            while(true) {
                Thread.sleep(1000);
                System.out.println("짐 5개 나르기");
                this.storage.popStack(5);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThreadWaitExample {
    public static void main(String[] args) {
        Storage storage = new Storage();
        AddStackThread addStackThread = new AddStackThread(storage);
        PopStackThread popStackThread = new PopStackThread(storage);

        addStackThread.start();
        popStackThread.start();
    }
}
