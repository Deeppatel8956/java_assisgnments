package modul2;
import java.util.ArrayList;
import java.util.List;
public class que30 {
public static void main(String[]args) {
	List list3=new ArrayList();
	list3.add("Deep");
	list3.add("shah");
	list3.add(29);
	list3.add("#@");
	list3.add("82096");
    System.out.println(list3);
    if(list3.contains("Shah")) {
    	System.out.println("found element");
    }
    else {
    	System.out.println("not found element");
    }
}
}
