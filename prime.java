/* Author: Anand A Jain
   Date: 2025-07-19
   Question: Write a Java program to check whether a given number is prime using if-else statements
and a for loop.
*/
import java.util.Scanner;

public class prime {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        if(n<=1){
            System.out.println("the given number is not a prime number");
        }
        else{
            int flag=0;
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    System.out.println("the given number is not a prime number");
                    flag=1;
                    break;
                }
                
            }
            if(flag==0){
                System.out.println("the given number is a prime number");
            }
        }
        in.close();
    }
    
}

