/**Author: Anand A Jain
 * Date:02-08-2025 
 * Search for a String Element 
Create a Vector<String> with values: "Pen", "Notebook", "Eraser", and 
"Marker". Ask the user (using Scanner) to enter an item name. Check if the item 
exists in the vector and print "Item found" or "Item not found".
 */

import java.util.*;

public class SearchVector {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector<String> Item = new Vector<>();
        Item.add("Pen");
        Item.add("Notebook");
        Item.add("Eraser");
        Item.add("Marker");

        System.out.println("Enter the item to be searched");
        String item = in.next();

        if(Item.contains(item))
            System.out.println("Item found");
        else
            System.out.println("Item not found");

        in.close();
    }
}
