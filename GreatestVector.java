/**Author: Anand A Jain 
 * Date:02-08-2025 
 * Find the Largest Number in a Vector 
Using a Vector<Integer> with values 25, 60, 15, 80, and 45, write a Java snippet 
to 
find and print the maximum value in the vector.
 */

import java.util.*;
import java.util.Vector;

public class GreatestVector {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector<Integer> numbers = new Vector<>();
        numbers.add(25);
        numbers.add(60);
        numbers.add(15);
        numbers.add(80);
        numbers.add(45);

        int max = numbers.get(0);
        for(int i : numbers) {
            if(max < i)
                max = i;
        }
        System.out.println("largest number =" + max);
        in.close();
    }
}
