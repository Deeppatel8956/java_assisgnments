package modul2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class que27 {
	public static void main(String[]args) {
		List list1=new ArrayList();
		list1.add("Deep");
		list1.add("Patel");
		list1.add(0);
		list1.add("!@#");
		list1.add("12345");
		System.out.println(list1);
		Scanner sc=new Scanner(System.in);
		String element;
		element=(String) list1.get(sc.nextInt());
		System.out.println("the index is : "+element);
		
	} 


}
