package demo;
import java.util.Scanner;
class B{
	public void show() {
		System.out.println("this is show method inside B class");
	}
}
public class stage {
    public void main(String[]args) {
    	System.out.println("Deep");
    	System.out.println("Hello dep agian");
    	int i=23,j=45;
    	System.out.println(i);
    	int X=i+j;
    	System.out.println("addton for i and j="+X);
    	int a,b,c;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter a =");
    	a = sc.nextInt();
    	System.out.println("enter b =");
    	b = sc.nextInt();
    	c = a*b
    	System.out.println(c);
    	B obj = new B();
    	obj.show();
    } 
}
