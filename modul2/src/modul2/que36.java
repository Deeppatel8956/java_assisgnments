package modul2;
import java.util.HashSet;
import java.util.Iterator;
public class que36 {
	public static void main(String[]args) {
		 HashSet<String> h=new HashSet<String>();
		  h.add("Harsh");
		  h.add("Vijay");
		  h.add("Amit");
		  h.add("Yash");
		  System.out.println("The Hash set is :"+h);
     	  System.out.println("The Hash set is :"+h.size());
     	  Iterator<String> itr=h.iterator();
     	  while(itr.hasNext()) {
     		  System.out.println(itr.next());
     	  }
			
	}

}
