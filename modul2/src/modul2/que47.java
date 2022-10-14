package modul2;
import java.util.ArrayList;
import java.util.List;
public class que47 {
	public static void main(String[]args) {
		List<String>list=new ArrayList<>();
		list.add("black");
		list.add("monday");
		list.add("star");
		System.out.println(list);
		String list1="deep";
		list.set(0,list1);
		System.out.println("replace"+list);
	}
}
