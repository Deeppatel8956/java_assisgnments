package modul2;
abstract class Parents{
	public abstract void message();
   }
	class son extends Parents{
		public void message() {
		System.out.println("This first subclass");
		}
	}
	class daugther extends Parents{
		public void message() {
		System.out.println("This second subclass");
		}
}
public class que15 {
public void main(String[]args) {
	son s=new son();
	s.message();
	daugther d=new daugther();
	d.message();
} 
}
