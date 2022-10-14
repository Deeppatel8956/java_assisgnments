package modul1;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Q12 {
public static void main(String[]args) {
	SimpleDateFormat sdf=new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
	Date date=new Date();
	System.out.println(sdf.format(date));
}
}
