package Methods;

public class Method03 {
 static double a=50,b=70,c=80;

	public static void main(String[] args) {
		System.out.println("a is:" +a);
		System.out.println("b is:" +b);
	System.out.println("c is:" +c);
	    double res = Method03.average(a,b,c);
		System.out.println("average:"+res );
		System.out.println("average:"+average(10.25,58.0,49.12));
		System.out.println("average:"+average(78.15,95.0,41.25));
		System.out.println("average:"+average(1.59,46.30,72.12));
	
	}
	public static double average(double a,double b,double c) //int a=12,int b=15,int c=17;
	//int a=p=55, b=q=58, c=r=82;
{
       return (a+b+c)/3;
}
}