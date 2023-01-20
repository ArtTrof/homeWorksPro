package Lambda.task3;

import java.util.ArrayList;
import java.util.List;

public class Book implements Display{
    private int year;
    private String Author,name;

    public Book() {
    }

    public Book(String name, String author, int year ) {
        this.year = year;
        this.Author = author;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "year=" + year +
                ", Author='" + Author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void print(Display o) {

    }
}
@FunctionalInterface
interface Display{
    public void print(Display o);
}
