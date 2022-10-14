package modul2;
class Member{
	String Name;
	int age;
	int salary,phone;
	public void printSalary(String Name,int age,int salary,int phone) {
		this.Name=Name;
		this.age=age;
		this.salary=salary;
		this.phone=phone;
	}
	public String toString() {
		return "Member [assignName="+Name+", age="+age+", salary="+salary+", phone=" +phone+"]";
		
	}
	}
class employee extends Member{
	String spacialization;
	
}
class manager extends Member{
	String dpartment;
	
}
public class que11 {
public static void main(String[]args) {
	employee e=new employee();
	e.printSalary("Deep",34,100000,987653211);
	System.out.println(e);
	manager m=new manager();
	m.printSalary("amit",30,35000,1234567893);
	System.out.println(m);
}
}
