/**Author: Anand A Jain 
 * Date:30-07-2025
 * Input n numbers and store them in an array. Then display the array elements in the same order and in reverse order
 */
import java.util.*;
public class ArrayOrder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=in.nextInt();
        int[] num=new int[10];
        System.out.println("Enter the element");
        for(int i=0;i<n;i++){
            num[i]=in.nextInt();
        }
        System.out.println("the element in same order");
        for(int i=0;i<n;i++){
            System.out.print(num[i] + " ");

        }
        System.out.println("\nelement in reverse order ");
        for(int i=n-1;i>=0;i--){
            System.out.print(num[i] + " ");
        }


    }

    
}
