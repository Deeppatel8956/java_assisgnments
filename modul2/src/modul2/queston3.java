//Compare string to charactor seq.compering topsint.com and topsint.com:true compering Topsint.com and topsint.com:false//

package modul2;

public class queston3 {
public static void main(String[]args) {
	String name1="topsint.com";
	String name2="topsint.com";
	System.out.println(name1.equals(name2));
	System.out.println(name1.equalsIgnoreCase(name2));
	String name3="topsint.com";
	String name4="Topsint.com";
	System.out.println(name3.equals(name4));
}
}
