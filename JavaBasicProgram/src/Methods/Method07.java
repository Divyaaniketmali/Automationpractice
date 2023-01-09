package Methods;

public class Method07 {

	
		float a=15.56f;
		int add(int num1,int num2) {
			return (num1+num2);
		}
		public static void main(String[] args) {
			
			Method07 m1=new Method07();
			
			System.out.println(m1.a);
			//System.out.println(Method7.add(12, 17));
			int sum=m1.add(12, 17);
			System.out.println("sum: "+sum);
		}
		
	}