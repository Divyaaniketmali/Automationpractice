package Inheritance;

class rectangle {
	static int a=10;
	int b=20;
	
}
class triangle extends rectangle {
	static int c=15;
	int d=25;
	
}
class circle extends triangle {
	static int e=55;
	int f=75;
	
}
public class Example2 {
	public static void main(String[] args) {
	System.out.println("Class rec static:" +rectangle.a);//10
	System.out.println("Class TRI static:" +triangle.c);//15
	System.out.println("Class circle static:" +circle.e);//55
	circle C= new circle();
	System.out.println("Class cir nonstatic:" +C.d);//25
	System.out.println("Class ir nonstatic:" +C.f);//75
	triangle E=new triangle();
	System.out.println("Class tri nonstatic:" +E.d);//25
	System.out.println("Class tri nonstatic:" +E.b);//20
	}
}
	
