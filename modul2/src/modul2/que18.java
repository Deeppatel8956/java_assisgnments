package modul2;
import java.util.Scanner;
public class que18 {
public void main(String[]args) {
	int fact=1;
	System.out.println("Enter the number:");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	System.out.println("The Factorial of"+num+"is:"+fact);
}
}
