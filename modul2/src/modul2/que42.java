package modul2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class que42 {
public static void main(String[]args) {
	List<String>list=new ArrayList<String>();
	list.add("alex");
	list.add("houseing");
	list.add("tom");
	list.add("star");
	System.out.println(list);
	Collections.swap(list, 4, 1);
	System.out.println("Swap list"+list);
}
}
