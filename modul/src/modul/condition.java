package modul;
import java.util.Scanner;
public class condition {
public static void main(String[]args) {
	int i=0;
	if(i>0) {
		System.out.println("yes");
	}
	//2 if else
	if (i>0) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
	//3 switch case
	int lang;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your choise:press 1 for hindi\n"+"press 2 for english\n");
    lang=sc.nextInt();
	switch(lang) {
	case 1:
		System.out.println("You selected Hindi");
		break;
	case 2:
		System.out.println("You selected English");
		break;
	default:
		System.out.println("invalid input");
	}
	
}

}
