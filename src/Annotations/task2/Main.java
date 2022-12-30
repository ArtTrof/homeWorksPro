package Annotations.task2;

import java.lang.management.MemoryType;
import java.lang.reflect.Method;

/**
 * @author  Artem Trofymenko
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Creating calculator object
         * */
        Calculator calculator = new Calculator();
        /**
         * Creating reflection of the class
         * */
        Class<?>cl = Calculator.class;
        /**
         * Creating code to  call method
         * */
try {
    Method m = cl.getDeclaredMethod("result",int.class,int.class);
    Add add = m.getAnnotation(Add.class);
    calculator.result(add.num1(), add.num2());

}
catch(NoSuchMethodException e){
    e.printStackTrace();
}
}
}
