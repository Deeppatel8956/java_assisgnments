package modul1;

public class Q7 {
public static void main(String[]args) {
	int n=125463;
	int Count=0;
	while(n>0) {
		n=n/10;
		Count=Count+1;
	}
	System.out.println(Count);
}
}
