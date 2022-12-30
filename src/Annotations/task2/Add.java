package Annotations.task2;

import java.lang.annotation.*;

/**
 * @author  Artem Trofymenko
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Add {
    int num1() default 0;

    int num2() default 0;
}
