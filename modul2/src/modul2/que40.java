package modul2;
import java.util.ArrayList;
import java.util.List;
public class que40 {
	public static void main(String[]args) {
		List<String> list=new ArrayList<>();
		list.add("deep");
		list.add("fan");
		list.add("tom");
		list.add("red");
		System.out.println(list);
		List<String> list1=list.subList(0, 2);
		System.out.println("the element"+list1);
	}

}
