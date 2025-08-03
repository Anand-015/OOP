/** Author:Anand A Jain
 * Date: 2%-07-2025
 * Input an integer and check if it's a palindrome (reads same forward and backward) using a while loop.
 */
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        if(num<0){
            System.out.println("Enter the positive number");
        }
        else{
            int reverse=0;
            int orginal=num;
            while (num>0) {
                reverse=reverse*10+num%10;
                num=num/10;
                
            }
            if(reverse==orginal)
            {
                System.out.println("the number is palindrome");

            }
            else{
                System.out.println("the number is not palindrome");
            }
        }
        in.close();
    }
}
