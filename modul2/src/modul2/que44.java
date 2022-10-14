package modul2;
import java.util.HashSet;
public class que44 {
public static void main(String[]args) {
	HashSet<String>list=new HashSet<String>();
	list.add("black");
	list.add("monday");
	list.add("star");
	list.add("virat");
	System.out.println("AI:"+list);
	String arr[]=new String[list.size()];
	list.toArray(arr);
	for(String s:arr) {
		System.out.println(s);
	}
}
}
