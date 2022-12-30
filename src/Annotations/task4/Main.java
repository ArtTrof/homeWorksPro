package Annotations.task4;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Math math = new Math();
        Class<?> cl = Math.class;
            Method m = cl.getDeclaredMethod("sum", int.class, int.class);
            addingTwoNumbers add = m.getAnnotation(addingTwoNumbers.class);
            math.sum(add.num1(),add.num2());
    }
}
