package Inheritance;

class A {
 static int a=50;
 double b=10.20;
   }
class B extends A {
	static int c=55;
	static double d=40.87;
	}
class C {
	 int c=85;
	static double d=40.7;
	}
public class Example1 {
	public static void main(String[] args) {
		System.out.println("Class A static members" + A.a);
		System.out.println("Class B static members" + B.c);
		System.out.println("Class B static members" + B.d);
		System.out.println("Class C static members" + C.d);
		A a1=new A();
		System.out.println("Class A non static members" + a1.b);
		C b1=new C();
		System.out.println("Class C NON static members" + b1.c);
		
		
		
		
	}
}