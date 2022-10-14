package modul2;

public class que21 {
public static void main(String[]args) {
	try {
		int a[]=new int[5];
		a[5]=30/0;
		System.out.println(a[3]);
		
	}catch (ArithmeticException e ) {
		System.out.println("Cannot not devisiable by zero ");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array is not of index");
	}
}
}
