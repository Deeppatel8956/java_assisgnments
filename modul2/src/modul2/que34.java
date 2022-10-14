package modul2;
import java.util.HashSet;
import java.util.Iterator;
public class que34 {
public static void main (String[]args) {	
  HashSet<String> h=new HashSet<String>();
  h.add("Deep");
  h.add("Patel");
  h.add("Amit");
  h.add("Yash");
  System.out.println("The hash set:"+h);
  Iterator<String> itr=h.iterator();
  while(itr.hasNext()) {
	  System.out.println(itr.next());
  }
}
}
