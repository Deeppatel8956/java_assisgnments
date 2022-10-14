package modul2;
import java.util.ArrayList;
import java.util.List;
public class que43 {
public static void main (String[]args) {
	    List<String>list=new ArrayList<>();
	    list.add("alex");
		list.add("houseing");
		list.add("tom");
		list.add("star");
		System.out.println("Old List:"+list);
		 List<String>list1=new ArrayList<>();
		 list1.add("bell");
		 list1.add("bottom");
		 list1.add("hero");
		 list1.add("red");
		 System.out.println("New list:"+list1);
		 List<String>i=new ArrayList<>();
		 i.addAll(list);
		 i.addAll(list1);
		 System.out.println("New Array"+i);
}
}
