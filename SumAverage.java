/**Author: Anand A Jain
 * Date:30-07-2025
 * Input n numbers and calculate the sum and average of the elements in the array.
 */
import java.util.*;

public class SumAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = in.nextInt();
        int[] num = new int[n];
        int sum = 0;
        System.out.println("Enter the numbers");
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
            sum = sum+num[i];
        }
        float average ;
        average=sum/n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        in.close();
    }
}

