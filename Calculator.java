/** Author:Anand A Jain
 * Date: 25-07-2025
 * Create a calculator that takes two numbers and an operator (+, -, *, /) and uses switch to perform the operation.
 */
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the 1st number");
        int num1=in.nextInt();
        System.out.println("Enter the 2nd number");
        int num2=in.nextInt();
        System.out.println("Enter the operator(+,-,*,/)");
        char operation=in.next().charAt(0);
        switch (operation) {
            case '+':
            System.out.println("the sum is "+(num1+num2));
             break;
            case '-':
            System.out.println("the substraction is "+(num1-num2));
            break;
            case '*':
            System.out.println("The multiplication is "+(num1*num2));
            break;
            case '/':
            System.out.println("The division is "+(num1/num2));
            break;
            default:
            System.out.println("Enter the vaild operator");
                break;
        }
    }
}

       