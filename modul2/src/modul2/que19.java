package modul2;
class shape{
	public void ThisisShape() {
		System.out.println("This is shape class");
	}
}
class rectangle extends shape{
	public void ThisisRectangle() {
		System.out.println("This is Rectangle class");
	}
}
class circle extends shape{
	public void ThisisCircle() {
		System.out.println("This is cricle class");
	}
}
class square extends rectangle{
	public void ThisisRectangle() {
		System.out.println("This is squre class");
	}
}
public class que19 {
public static void main(String[]args) {
	square s=new square();
	s.ThisisShape();
	s.ThisisRectangle();
}
}
