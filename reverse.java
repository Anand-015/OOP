/* Author: Anand A Jain
   Date: 2025-07-19
   Question: Write a Java program to print the reverse of a given number using a for loop.
*/
import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=in.nextInt();
        int reverse=0;
        for(;num!=0;num=num/10){
            int digit = num % 10;
            reverse=reverse* 10+ digit;
        }
        System.out.println("the reverse number is "+ reverse);
        in.close();  
    }
    
}
