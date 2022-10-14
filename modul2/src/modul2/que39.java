package modul2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class que39 {
	public static void main(String[]args) {
		List<String> list=new ArrayList<>();
		list.add("Alex");
		list.add("hero");
		list.add("amit");
		list.add("car");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("Reverse method"+list);
	}

}
