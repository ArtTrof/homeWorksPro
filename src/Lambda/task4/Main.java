package Lambda.task4;

import java.util.Scanner;

public class Main {
    static  double result;
    static String operator;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("input x");
        double x = in.nextDouble();
        System.out.println("input y");
        double y = in.nextDouble();
        System.out.println("Choose 'sum' 'extract' 'multiply' 'divide'");
        operator = in.next();
        System.out.println();
        switch (operator){
            case "sum":
             Operator sum = (a,b)->x+y;
             result = sum.calculate(x,y);
             break;
            case "extract":
                Operator extr = (a,b)->x-y;
                result = extr.calculate(x,y);
                break;
            case "multiply":
                Operator mult = (a,b)->x*y;
                result = mult.calculate(x,y);
                break;
                 case "divide":
                Operator dev = (a,b)->x/y;
                try{
                result = dev.calculate(x,y);}
                catch (Exception e){
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("wrong operator");
                break;
        }
        System.out.println(result);


    }
}
@FunctionalInterface
interface Operator{
    double calculate(double x,double y);
}
