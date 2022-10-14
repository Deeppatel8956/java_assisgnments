package modul2;
abstract class marks{
	abstract float getPercentage();
}
class C extends marks{
	float maths,chemistry,physics;
	float per;
	public C(float m,float c,float p) {
	this.maths=m;
	this.chemistry=c;
	this.physics=p;
}
	public float getPercentage(){
		float total=((maths+chemistry+physics)/300)*100;
		return total;
		}
	}
class D extends marks{
	float maths,chemistry,physics,english;
	public D(float m,float c,float p,float e) {
		this.maths=m;
		this.chemistry=c;
		this.physics=p;
		this.english=e;
	}
	public float getPercentage() {
		float total=((maths+chemistry+physics+english)/400)*100;
		return total;
	}
}
public class que17 {
public void main (String[]args) {
	C a=new C(60,50,46);
	System.out.println("Total percentage: "+a.getPercentage());
	D b=new D(60,50,46,90);
	System.out.println("Total percentage: "+b.getPercentage());
} 


}
