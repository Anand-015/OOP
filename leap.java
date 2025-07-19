/* Author: Anand A Jain
   Date: 2025-07-19
   Question: Write a Java program to check if a given year is a leap year or not using if-else statements.
*/
import java.util.*;
public class leap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=in.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400==0)){
            System.out.println("the year "+year+" is a leap year ");   
        }
        else{
            System.out.println("the year "+year+" is a Not leap year "); 

        }
        
    }
    
}
