package Threads.task5;

public class Main {
    public static void main(String[] args) {
        /**in this case we will see deadlock that means that program will
         be stunned because both threads have methods that call out each othrer
         and that will cause deadlock*/

        Thread1 t1 = new Thread1();
        t1.setName("firstThread");
        Thread2 t2 = new Thread2();
        t1.setName("secondThread");
        t1.method(t2);
        t2.method(t1);
        t1.start();
        t2.start();

    }
}

class Thread1 extends Thread {
    Thread t1;
    @Override
    public void run() {
        System.out.println("Thread 1 started");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("Thread 1 interrupted joined other Thread");
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " "+ i);
        }
        System.out.println("Thread 1 finished");
    }
    public void method(Thread t){
        this.t1 = t;
    }
}

class Thread2 extends Thread {
    Thread t2;
    @Override
    public void run() {
        System.out.println("Thread 2 started");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("Thread 2 interrupted joined other Thread");
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " "+ i);
        }
        System.out.println("Thread 2 finished");
    }
    public void method(Thread t){
        this.t2 = t;
    }
}
