package modul2;
import java .util.ArrayList;
import java.util.Collections;
import java.util.List;
public class que33 {
public static void main(String[]args) {
	List<String> list=new ArrayList<>();
	list.add("Deep");
	list.add("shah");
	list.add("Patel");
	list.add("Amit");
	System.out.println(list);
	Collections.shuffle(list);
	System.out.println("Shuffle method "+list);
}
}
