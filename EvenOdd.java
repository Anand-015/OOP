/**Author: Anand A Jain
 * Date:30-07-2025
 * Count the number of even and odd elements in the array of n integers entered by the user
 */
import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = in.nextInt();
        int[] num = new int[n];
        int even = 0, odd = 0;
        System.out.println("Enter the  numbers");
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
               if (num[i] % 2 == 0)
                even=even+1;
            else
                odd=odd+1;
        }
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
        
    }
}

