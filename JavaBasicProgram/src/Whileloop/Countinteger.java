package Whileloop;

public class Countinteger {

	public static void main(String[] args) {
		int count=0,num=012345;
		while (num!=0){
			num/=10;
			++count;
		}
		System.out.println("no.of digit"+count);
		
		}

	}


