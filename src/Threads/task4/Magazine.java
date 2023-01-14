package Threads.task4;

public class Magazine extends Thread{
    private String location,firm;
    Product[] products;

    public Magazine(String location, String firm, Product[] products) {
        this.location = location;
        this.firm = firm;
        this.products = products;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < products.length; i++) {
            products[i].produce(this);
        }

    }
}
