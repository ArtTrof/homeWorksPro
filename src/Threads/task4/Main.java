package Threads.task4;

public class Main {
    public static void main(String[] args) {
        Product[] products = {new Product(1, "Washing machine"),
                new Product(2, "Iron"),
                new Product(3, "Forks"),
                new Product(5, "Keyboard"),
                new Product(6, "Monitor"),
                new Product(7, "Car"),
                new Product(8, "Cup"),
                new Product(9, "Mirror")};

        Magazine m1 =new Magazine("Germany","GG-magazine",products);
        Magazine m2 =new Magazine("Poland","Grzegorz PL",products);
        Magazine m3 =new Magazine("Ukraine","Rozetka",products);
        Magazine m4 =new Magazine("USA","Mil-Tec",products);
        Magazine m5 =new Magazine("England","Tea-Company",products);

        m2.start();
        m1.start();
        m3.start();
        m4.start();
        m5.start();
    }
}
