/* Author: Anand A Jain
   Date: 2025-07-19
   Question: Write a Java program to print the Fibonacci series up to a given number using a while loop.
*/
import java.util.*;
public class fibonacci {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Limit number");
        int n=in.nextInt();
        int a=0,b=1,c=0;
        System.out.println("fibonacci series upto :"+n);
        while (a<=n) {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;    
        }   
        in.close();
    }
}
