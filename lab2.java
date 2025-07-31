package module1;
import java.util.*;
class Mycalculator{
	int number1;
	int number2;
	Mycalculator(int a,int b){
	number1=a;
	number2=b;
	}
	void add() {
	int sum=number1+number2;
	System.out.println("Result:"+sum);
		
	}
	void subtract() {
		int sub=number1-number2;
		System.out.println("Result:"+sub);
		
	
	}
	void multiply() {
		System.out.println("Result:"+(number1*number2));
	}
	void divide() {
		if(number2!=0) {
			System.out.println("Result:"+(number1/number2));
			
		}
		else {
			System.out.println("divison not possible");
		}
	}
	
}

public class CalculatorDemo {

	public static void main(String[] args) {
		char count='y';
		while(count=='y') {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("--- Calculator Menu ---\n"
				+ "1. Add\n"
				+ "2. Subtract\n"
				+ "3. Multiply\n"
				+ "4. Divide\n"
		        +"Enter your choice (1-4):");
		int choice=sc.nextInt();
		System.out.println("Enter the 2 number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		Mycalculator obj=new Mycalculator(n1,n2);
		switch(choice) {
		case 1:
			obj.add();
			break;
		case 2:
			obj.subtract();
			break;
		case 3:
			obj.multiply();
			break;
		case 4:
			obj.divide();
			break;
			default:
			   System.out.println("Enter the number 1-4");
			break;
			
			
		}
		 System.out.println("Do you want to continue? (Y/N):");
		 count=sc.next().charAt(0);
		}
		
	}

}
