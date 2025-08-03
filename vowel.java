/** Author: Anand A Jain
 * Date: 25-07-2025
 * Input a character and use a switch statement to determine if it's a vowel or a consonant.
 */
import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Character");
        char alphabet = in.next().charAt(0);

        switch(Character.toLowerCase(alphabet)) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("The character is a vowel");
                break;
            default:
                if(alphabet >= 'a' && alphabet <= 'z' || alphabet >= 'A' && alphabet <= 'Z') {
                    System.out.println("The character is a consonant");
                } else {
                    System.out.println("The character is not an alphabet");
                }
        }
        in.close();
    }
}
