/** Author: Anand A Jain
 * Date: 25-07-2025
 * Input n and print the first n Fibonacci numbers using a for loop.
 */
import java.util.*;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n = in.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3;

        for(int i = 0; i < n; i++) {
            System.out.println(num1);
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        in.close();
    }
}

