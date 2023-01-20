package Lambda.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Display> books = new ArrayList<>();
//        books.add(new Book("Bad wolves", "Connor", 2005));
//        books.add(new Book("Kerrigan", "Mc Pet9", 2009));
//        books.add(new Book("Bubble wars", "John", 2015));
//        books.add(new Book("Bald boy", "Sergij", 2000));
//        books.add(new Book("History of Ukraine", "Olga", 1999));
        Display books = new Book("Bad wolves", "Connor", 2005);
        //With lambda
        Display p1 =(book)-> System.out.println(book);
        p1.print(books);
        //with anon class
        Display books2 = new Book("Bad wolves", "Connor", 2005){
            @Override
            public void print(Display book){
                System.out.println(book);
            }
        };

        books2.print(books2);
    }
}
