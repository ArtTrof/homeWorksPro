package Annotations.task2;
/**
@author Artem Trofymkenko
*/

public class Calculator {
/**
    @param num1
    @param num2
*/
   @Add(num1 = 50,num2=250)
/**
 * method returns sum of num1 and num2
 *
*/

   public void result(int num1, int num2) {
       System.out.println(num1 + num2);
   }
}
