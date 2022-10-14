package modul2;
class area{
	int area;
	public void rectangle(int b,int c) {
		area=b*c;
		System.out.println(area);
	}
	public void square(int c) {
		area=c*c;
		System.out.println(area);
	}
}
public class question9 {
public static void main(String[]args) {
	area a=new area();
	a.rectangle(34, 44);
	a.square(50);
}
}
