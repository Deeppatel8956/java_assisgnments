package modul2;
import java.util.ArrayList;
import java.util.List;
public class que28 {
	public static void main (String[]args) {
		List list1=new ArrayList();
		list1.add("Amit");
		list1.add("Patel");
		list1.add(29);
		list1.add("93467");
		System.out.println(list1);
		list1.set(2,"patel");
		System.out.println("update list:"+list1);
	}

}
