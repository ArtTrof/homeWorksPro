package iteratorComparator.task3;

import java.util.*;

class Main{
    public static void main(String[] args) {



        Animal a1 = new Animal("Shepperd",10,20,300);
        Animal a2 = new Animal("Bulldog",10,20,300);
        Animal a3 = new Animal("Husky",10,20,300);
        Animal a4 = new Animal("Chihua-hua",10,20,300);

        ArrayList<Animal>a = new ArrayList<>();

        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);
        //Врбуємо сортування-сортування відбудеться по породі так як всі інші поля однакові
        Collections.sort(a);

        for(Animal tmp:a){
            System.out.println(tmp);
        }

    }
}