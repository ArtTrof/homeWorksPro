package iteratorComparator.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Main{
    public static void main(String[] args) {



        Animal a1 = new Animal("Shepperd",10,20,300);
        Animal a2 = new Animal("Bulldog",10,20,300);
        Animal a3 = new Animal("Husky",10,20,300);
        Animal a4 = new Animal("Chihua-hua",10,20,300);
        Animal[]a = {a1,a2,a3,a4};
        Arrays.sort(a);


        for(Animal tmp:a){
            System.out.println(tmp);
        }

    }
}