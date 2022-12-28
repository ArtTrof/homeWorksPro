package Reflection.task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";
        Scanner in = new Scanner(System.in);
        System.out.println("Input class name:");
        String cl = in.nextLine();

        Class<?> cls = cl.getClass();

        Method[] methods = cls.getDeclaredMethods();
        Constructor[] constructors = cls.getConstructors();
        Field[] fields = cls.getDeclaredFields();

        System.out.println("class name: "+cls.getName());

        System.out.println(s2+"Fields");
        for(Field tmp : fields){
            System.out.println(s1+tmp.getName());
        }
        System.out.println(s2+"Constructors");
        for(Constructor tmp: constructors){
            Class[] paramTypes = tmp.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(s1+paramType.getName() + " ");
            }
            System.out.println();
        }
        System.out.println(s2+"Methods");
        for (Method tmp:methods){
            System.out.println(s1+tmp.getName());
        }
    }
}
