import java.util.*;
public class factorial {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the positive integer:");
        int n=in.nextInt();
        int fact=1;
        int i=1;
        while (i<=n) {
            fact=fact*i;
            i++;

            
        }
        System.out.println("the factorial of the "+n+" is "+fact);
    }

}
