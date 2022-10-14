package modul1;
import java.util.Scanner;

public class Q1 {
	public static void main(String[]args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Input the 1st numbers: ");
		int num1=in.nextInt();
		System.out.print("Input the 2nd numbers: ");
		int num2=in.nextInt();
		System.out.print("Input the 3rd numbers: ");
		int num3=in.nextInt();
		
		if(num1>num2)
			if(num1>num3)
				System.out.println("The greatest:" +num1);
		if(num2>num1)
			if(num2>num3)
				System.out.println("The greatest:" +num2);
		if(num3>num1)
			if(num3>num2)
				System.out.println("The greatest:" +num3);
		
	}
	

}
