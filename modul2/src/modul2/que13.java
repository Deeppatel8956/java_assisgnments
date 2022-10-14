package modul2;
class Tringle{
	int i,j,k;
	private int angle;
	public void angle(int i,int j,int k) {
		this.i=i;
		this.j=j;
		this.k=k;
		int angle=i+j+k;
		System.out.println(angle);
		
	}
	public void area(int i,int j,int k) {
		this.i=i;
		this.j=j;
		this.k=k;
		int s=i+j+k/2;
		int r=s*(s-i)*(s-j)*(s-k);
		int area=(int)Math.sqrt(r);
		System.out.println(area);
		}
}
public class que13 {
public static void main(String[]args) {
	Tringle T=new Tringle();
    T.angle(3, 4, 5);
    T.angle(3, 4, 5);
}
}
