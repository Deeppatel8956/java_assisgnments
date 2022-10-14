package modul2;
import java.util.Scanner;
public class que25 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Total amount:");
		int balance=sc.nextInt();
		System.out.print("Enter the amount to withdraw:");
		int withdraw=sc.nextInt();
		if(withdraw<balance) {
			balance=balance-withdraw;
			System.out.print("Total Balance :"+balance);
		}
		else {
			throw new ArithmeticException("Sorry,Insuffcient Balance.Youe need more 500 RS.");
		}
	}

}
