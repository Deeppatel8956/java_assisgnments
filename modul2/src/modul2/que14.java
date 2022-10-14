package modul2;
class Complex{
	private final int real;
	private final int  imaginary;
	public Complex(int real,int imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	public Complex sum(Complex other) {
		int r=this.real+other.real;
		int i=this.imaginary+other.imaginary;
		return new Complex(r,i);
	}
	public Complex difference(Complex other) {
		int r=this.real-other.real;
		int i=this.imaginary-other.imaginary;
		return new Complex(r,i);
}
	public int getreal() {
		return real;
		}
	public int getimaginary() {
		return real;
	}
	
	public String toString() {
		return real+"+"+imaginary;
		
	}
	}
public class que14 {
public static void main(String[]args) {
	Complex c1=new Complex(10,20);
	Complex c2=new Complex(50,70);
	Complex sum=c1.sum(c2);
	Complex difference=c1.difference(c2);
	System.out.println("first:"+c1);
	System.out.println("first:"+c2);
	System.out.println("sum:"+sum);
	System.out.println("difference:"+difference);
}
}
