package assignments;

public class Ex9 {

	public static void main(String[] args) {
		int x=1,i=2,count=0;
		while(x>i)
	{
		if(x%i==0)
		{
			count++;
		}
		i++;
	}
		if(count==0)
	   System.out.println("value is prime");
		else 
		{
		System.out.println("value is not prime");			
		}
	}

}
