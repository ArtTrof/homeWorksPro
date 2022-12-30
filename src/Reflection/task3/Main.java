package Reflection.task3;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> cl = Student.class;
        System.out.println("Constructors :");
        Constructor<?>[] cr = cl.getConstructors();
        int i = 0;
        for (Constructor<?> tmp : cr) {
            Class[] paramTypes = tmp.getParameterTypes();
            System.out.println("Constructor " + (++i) + ":");
            for (Class<?> tmpp : paramTypes) {
                System.out.print(tmpp.getName() + " ");
            }
            System.out.println();
        }
        System.out.println();
        Field[] field = cl.getDeclaredFields();
        System.out.println("Fields:");
        for (Field tmp : field) {
            Class<?> fieldType = tmp.getType();
            System.out.println("Name:" + tmp.getName());
            System.out.println("Type:" + tmp.getType());
            System.out.println("Modifier:" + getModifiers(tmp.getModifiers()));
        }
        System.out.println();
        Method[] methods = cl.getMethods();
        for (Method tmp : methods) {
            System.out.println("Name:" + tmp.getName());
            System.out.println("return type:" + tmp.getReturnType().getName());
            Class<?>[] paramtypes = tmp.getParameterTypes();
            System.out.println("Parameter types:");
            for (Class<?> tmpp : paramtypes) {
                System.out.println("" + tmpp.getName());
            }
            System.out.println();
        }
        System.out.println("Class modifier:");
        int mod = cl.getModifiers();
        System.out.println(getModifiers(mod));
    }
    public static String getModifiers(int a) {
        if (Modifier.isPrivate(a)) {
            return "Private";
        }
        if (Modifier.isPublic(a)) {
            return "Public";
        }
        if (Modifier.isProtected(a)) {
            return "Protected";
        }
        if (Modifier.isStatic(a)) {
            return "Static ";
        }
        if (Modifier.isAbstract(a)) {
            return "Abstract";
        }
        if (Modifier.isFinal(a)) {
            return "Final";
        }
        return "";
    }
}
