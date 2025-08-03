/** Author: Anand A Jain
 * Date: 25-07-2025
 * Take n as input and print odd numbers from 1 to n using a for loop and continue statement.
 */
import java.util.*;

public class Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = in.nextInt();

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0)
                continue;
            System.out.print(i + " ");
        }

        in.close();
    }
}

