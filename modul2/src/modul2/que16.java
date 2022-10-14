package modul2;
abstract class bank{
	public  abstract void getBlance();
}
class bankA extends bank{
	public void getBlance() {
		System.out.println("deposited : $100");
	}
}
class bankB extends bank{
	public void getBlance() {
		System.out.println("deposited : $150");
	}
}
class bankC extends bank{
	public void getBlance() {
		System.out.println("deposited : $200");
	}
}
public class que16 {
	public void main(String[]args) {
		bankA A=new bankA();
		A.getBlance();
		bankB B=new bankB();
		B.getBlance();
		bankC C=new bankC();
		C.getBlance();
}
}	
