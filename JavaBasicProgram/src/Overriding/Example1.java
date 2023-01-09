package Overriding;

class Divya {
	public void student () {
		System.out.println("Divya is wife.");
		
	}
}
class Aniket extends Divya {
	public void student () {
		System.out.println("Aniket is husband.");
	}
	public void employee() {	
	System.out.println("Aniket is employee.");
	}
}
public class Example1 {
	public static void main(String[] args) {
		Divya D=new Divya();
		D.student();
		Aniket A=new Aniket();
		A.student();
		A.employee();
		System.out.println("*************.");
		Divya E=new Aniket();
		E.student();
		
	}
}