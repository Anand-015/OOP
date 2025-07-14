import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the full Name :");
        String name=sc.nextLine();
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        System.out.println("Enter the Mobile Number:");
        long number=sc.nextLong();
        System.out.println("Enter the cgpa:");
        double cgpa=sc.nextDouble();
        System.out.println("Enter the attendance percantage:");
        float attendance=sc.nextFloat();
        System.out.println("Full Name :"+name);
        System.out.println("Age:"+age);
        System.out.println("Mobile Number:"+number);
        System.out.println("CGPA:"+cgpa);
        if(attendance>=90)
        System.out.println("Attendance Mark: 10");
        else
        System.out.println("Attendance Mark:"+attendance/10);    

    }

    
}
