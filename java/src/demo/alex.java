package demo;

import java.util.Scanner;
class A{
	public void show() {
		System.out.println("this is show method inside  A  class ");
	}
}

public class alex {
     public static void main(String[]args) {
    	 System.out.print("hello");
    	 System.out.println("hello again");
    	 int i=23,j=45;
    	 System.out.println(i);
    	 int k=i*j;
    	 System.out.println("addition for i and j ="+k);
    	 int a,b,c;
    	 Scanner sc =new Scanner(System.in);
    	 System.out.println("enter a =");
    	 a =sc.nextInt();
    	 System.out.println("enter b =");
    	 b=sc.nextInt();
    	 c=a*b;
    	 System.out.println(c);
    	 A obj =new A();
    	 obj.show();
    	 // c=a+b;
     }
     
}
