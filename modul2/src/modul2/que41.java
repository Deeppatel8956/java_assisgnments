package modul2;
import java.util.ArrayList;
import java.util.List;
public class que41 {
public static void main(String[]args) {
	List<String>list=new ArrayList<String>();
	list.add("tony");
	list.add("amit");
	list.add("deep");
	list.add("alex");
	System.out.println("The list of first element:"+list);
	List<String>list1=new ArrayList<String>();
	list1.add("tony");
	list1.add("amit");
	list1.add("deep");
	list1.add("alex");
	System.out.println("The list of second element:"+list1);
	boolean b=list.equals(list1);
	System.out.println(b);
}
}
