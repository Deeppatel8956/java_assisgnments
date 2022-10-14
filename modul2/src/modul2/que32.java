package modul2;
import java .util.ArrayList;
import java.util.Collections;
import java.util.List;
public class que32 {
public static void main(String[]args) {
	List<String> list=new ArrayList<String>();
	list.add("Deep");
	list.add("shah");
	list.add("Patel");
	list.add("Amit");
System.out.println("The list of first element:"+list);
List<String> list1=new ArrayList<String>();
list1.add("Hero");
list1.add("yes");
list1.add("ZXC");
list1.add("WER");
System.out.println("The list of second element:"+list1);
List<String> list2=new ArrayList<String>();
list2.add("E");
list2.add("Y");
list2.add("Z");
list2.add("W");
System.out.println("The list of second element:"+list2);
Collections.copy(list, list1);
Collections.copy(list2, list1);
System.out.println("After copy:");
System.out.println("The list of first element:"+list);
System.out.println("The list of second element:"+list1);
System.out.println("The list of second element:"+list2);
	
}

}
