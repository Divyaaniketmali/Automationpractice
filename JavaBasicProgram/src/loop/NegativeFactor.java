package loop;

public class NegativeFactor {

	public static void main(String[] args) {
	int no= -60;
			System.out.println("Factors of "+ no);
	for(int i= no;i<=Math.abs(no);++i)
		if(i==0)
		System.out.println(i+" ");
		else
			if(no%i==0)
		System.out.println(i+" ");
	}
	

}
