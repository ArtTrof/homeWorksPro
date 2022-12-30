package Annotations.task3;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        First first = new First();

        Second second = new Second();


        if(first.getClass().getAnnotations().length>0){
            System.out.println("Annotations in First class:");
            for (Annotation tmp:first.getClass().getAnnotations()) {
                System.out.println(tmp);
            }

        }else
            System.out.println("There is no annotations in the first class");


        if(second.getClass().getAnnotations().length>0){
            System.out.println("Annotations in First class:");
            for (Annotation tmp:second.getClass().getAnnotations()) {
                System.out.println(tmp);
            }

        }else
            System.out.println("There is no annotations in the first class");

    }
}
