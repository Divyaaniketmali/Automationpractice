package ThisKeyword;

public class ThisKeyword2 {
	char x;
	// Constructor with a parameter
	public ThisKeyword2(char x) {
		this.x = x;
	}
	{
		for (char B='M';B<='X';B++)
		{int value= B; 
		System.out.println(B+ " : "+value);}
   }
	// Call the constructor
	public static void main(String[] args) {
		ThisKeyword2 myObj = new ThisKeyword2('A');
		System.out.println("Value of x = " + myObj.x);//
		System.out.println("Value of x"  );
	}

}