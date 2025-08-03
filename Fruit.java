/**Author: Anand A Jain
 * Date:02-08-2025 
 * Add and Display String Elements 
Create a Vector<String> to store the names of 5 fruits. Add the elements, and 
then 
print each fruit on a new line using an enhanced for loop.
 */

import java.util.*;
import java.util.Vector;

public class Fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector<String> fruits = new Vector<>();
        System.out.println("Enter 5 fruits");
        for(int i = 0; i < 5; i++) {
            String fruit = in.next();
            fruits.add(fruit);
        }
        System.out.println("Fruits:");
        for(String i : fruits) {
            System.out.println(i);
        }
        
    }
}

