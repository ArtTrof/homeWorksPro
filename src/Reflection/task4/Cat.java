package Reflection.task4;

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Animal animal = new Animal();
        Class<?>cl = Animal.class;

        System.out.println("Old public field value:"+animal.getName());
        Field f1 = cl.getDeclaredField("name");
        f1.setAccessible(true);
        f1.set(animal,"Dog");
        String name = (String)f1.get(animal);
        System.out.println("New public field value:"+animal.getName());
        System.out.println();
        System.out.println("Old private field value:"+animal.getAge());
        Field f2 = cl.getDeclaredField("age");
        f2.setAccessible(true);
        f2.setInt(animal,2);
        System.out.println("New private value:"+animal.getAge());


    }
}
