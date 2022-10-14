package modul2;
import java.util.ArrayList;
import java.util.List;
public class que49 {
	public static void main(String[]args) {
		List<String>list=new ArrayList<>();
		list.add("black");
		list.add("monday");
		list.add("star");
		list.add("friday");
		System.out.println("This list of frist element:"+list);
			List<String>list1=new ArrayList<>();
			list1.add("deep");
			list1.add("alex");
			list1.add("tonny");
			System.out.println("This list of second element:"+list1);
			list.retainAll(list1);
			System.out.println("retain"+list);
	}
}
