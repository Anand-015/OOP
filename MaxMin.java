/**Author: Anand A Jain
 * Date:30-07-2025
 * Input n numbers into an array and find the maximum and minimum values in the array.
 */
import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = in.nextInt();
        int[] num = new int[n];
        System.out.println("Enter " + n + " numbers");
        for (int i = 0; i < n; i++)
            num[i] = in.nextInt();
        int max = num[0], min = num[0];
        for (int i=0;i<n;i++) {
            if (max < num[i])
                max = num[i];
            if (min > num[i])
                min = num[i];
        }
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
        in.close();
    }
}

