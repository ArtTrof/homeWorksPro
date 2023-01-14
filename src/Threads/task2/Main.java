package Threads.task2;

public class Main implements Runnable {
    public static void main(String[] args) {

        Thread main = new Thread(new Main());
        Thread first = new Thread(new First());
        Thread second = new Thread(new Second());


        first.start();
        try {
            first.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(first.getName() + " finished");
        second.start();
        try {
            second.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(first.getName() + " finished");

        main.start();
        try {
            main.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(main.getName()
        + " finished");
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (!(i == 9)) {
                System.out.println(i + " Main thread iteration");
            } else {
                System.out.println("Main thread finished");
            }
        }
    }
}

class First implements Runnable {
    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (!(i == 9)) {
                System.out.println(i + " First thread iteration");
            } else {
                System.out.println("First thread finished");
            }
        }
    }
}

class Second implements Runnable {
    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (!(i == 9)) {
                System.out.println(i + " Second thread iteration");
            } else {
                System.out.println("Second thread finished");
            }
        }

    }
}
