/** Author: Anand A Jain
 * Date: 25-07-2025
 * Input a four-digit number and calculate the sum of its digits using a while loop.
 */
import java.util.Scanner;
public class Sumofdigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 4 digit number");
        int num=sc.nextInt();
        int sum=0;
        while (num!=0) {
            sum=sum+num%10;
            num=num/10;
            
        }
        System.out.println("The sum is "+sum);
        sc.close();

    }
    
}
