package Threads.task3;

public class PriorityRunner {
    public static void main(String[] args) {
        Thread first = new Thread(new PriorityThread());
        Thread second = new Thread(new PriorityThread());
        Thread third = new Thread(new PriorityThread());
        //set names to threads
        first.setName("First thread");
        second.setName("Second thread");
        third.setName("Third thread");
        //set priorities
        first.setPriority(Thread.MAX_PRIORITY);
        second.setPriority(5);
        third.setPriority(Thread.MIN_PRIORITY);

        first.start();
        second.start();
        third.start();

    }
}
