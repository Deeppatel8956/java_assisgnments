package modul1;
import java.util.Scanner;
public class Q3 {
public static void main(String[]args) {
	int y;
	System.out.println("Enter any Year ");
	Scanner sc=new Scanner(System.in);
	y=sc.nextInt();
	
	if(y%4==0)
	      {
		if(y%100==0)
		    {
			if(y%400==0) {
		System.out.println("leap year");		
			}
			else {
				System.out.println("this is not leap year");
			}
		    }
		else {
			System.out.println("this is leap year");
		}
		}
	else {
		System.out.println("this is not leap year");
	}
}
}
