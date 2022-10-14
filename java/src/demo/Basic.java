package demo;
import java.util.Scanner;
class A{
	public void show() {
		System.out.println("this is method inside A class");
	}
	
}

public class Basic {
	public static void main(String[]args) {
		System.out.print("hello deep");
		System.out.println("hello java again");
		int i=11,j=13;
		System.out.println(i);
		int k=i+j;
		System.out.println("addtion of i and j="+k);
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a = ");
		a=sc.nextInt();
		System.out.println("enter b = ");
		b=sc.nextInt();
		c=a-b;
		System.out.println(c);
		A obj = new A();
		obj.show();
		// c=a+b;
		
	}
    

}
