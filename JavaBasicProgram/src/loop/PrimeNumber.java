package loop;

public class PrimeNumber {

	public static void main(String[] args) {
	int num=8,i,count=0;
	
	for(i=2;i<num;i++)
	 if(num%i==0)
		{count++;
	     break;}
	if(count==0)
    System.out.println(num+"is prime no.");
     else
	System.out.println(num+"is not prime no.");
	
	}

}
