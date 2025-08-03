/**Author:Anand A Jain
 * Date:02-08-2025 
 * Sum All Elements in an Integer Vector 
Create a Vector<Integer> and add the numbers 10, 20, 30, 40, and 50. Then, 
calculate and print the sum of all the elements in the vector.
 */

import java.util.*;
import java.util.Vector;

public class sumVector {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      Vector<Integer> numbers=new Vector<>();
      numbers.add(10);
      numbers.add(20);
      numbers.add(30);
      numbers.add(40);
      numbers.add(50);
      int sum=0;
      for(Integer i:numbers){
        sum=sum+i;
      }
      System.out.println("The sum:"+sum);

    }
}

