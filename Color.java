/**Author: Anand A Jain
 * Date:02-08-2025 
 * Remove an Element from a Vector 
Create a Vector<String> with the elements "Red", "Green", "Blue", and "Yellow". 
Remove "Green" and print the final contents of the vector.
 */

import java.util.*;
import java.util.Vector;

public class Color {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector<String> color = new Vector<>();
        color.add("Red");
        color.add("Green");
        color.add("Blue");
        color.add("Yellow");

        System.out.println("Elements before removing green");
        for(String i : color)
            System.out.println(i);

        color.remove("Green");

        System.out.println("Elements after removing green");
        for(String i : color)
            System.out.println(i);

        in.close();
    }
}

