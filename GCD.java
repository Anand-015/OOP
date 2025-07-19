/* Author: Anand A Jain
   Date: 2025-07-19
   Question: Write a Java program to find the greatest common divisor (GCD) of two numbers using a
while loop.
*/
import java.util.*;
public class GCD {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=in.nextInt();
        System.out.println("enter the second number:");
        int b=in.nextInt();
        while (a!=b) {
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        System.out.println("The GCD of given number is "+ a);
    }
    
}
