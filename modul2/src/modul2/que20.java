package modul2;
import java.util.Scanner;
public class que20 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first value :");
	int a=sc.nextInt();
	System.out.println("Enter the second value :");
	int b=sc.hashCode();
	try {
		double c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e) {
		System.out.println("Cannot divisible by zero");
	}
}
}
