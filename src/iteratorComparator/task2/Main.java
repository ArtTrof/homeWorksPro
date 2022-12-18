package iteratorComparator.task2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
class Car{
String name;

    public Car(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {
        //creating list
        List<Object> list = new ArrayList<>();
        //adding elements to list
        list.add("One");
        list.add(new Car("BWM"));
        list.add(3);
        list.add(4);
        list.add(5.25);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add("Word");

        System.out.println(list);
        //creating listIterator
        ListIterator<Object>iterator = list.listIterator();
        //foreach out print
        while (iterator.hasNext()){
           Object tmp = iterator.next();
            System.out.println(tmp);
        }

    }
}
