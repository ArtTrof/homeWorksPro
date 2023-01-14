package Threads.task4;

public class Product {
    private int id;
    private String name;
    boolean isDone;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    synchronized void produce(Magazine m) {
        if (!(isDone)) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            isDone = true;
            System.out.println("Product " + this.getName() + " with id " + this.getId() + " is stored in " + m.getLocation() + " by firm "
                    + m.getFirm());
        }
    }
}
