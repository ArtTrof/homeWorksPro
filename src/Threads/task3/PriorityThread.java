package Threads.task3;

public class PriorityThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i<=50;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " "+i);
        }
    }
}
