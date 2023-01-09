package assignments;

public class Ex7 {

	public static void main(String[] args) {
	int num1=300,num2=200,num3=100;
	if(num1>=num2 && num1>=num3)
		System.out.println("num1 is largest");
	else if (num2>=num3 && num2>=num1)
	System.out.println("num2 is largest");
	else 
		if(num3>=num1 && num3>=num2)
	System.out.println("num3 is largest");
	}
}
