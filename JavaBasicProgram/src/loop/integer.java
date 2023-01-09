package loop;

public class integer {

	public static void main(String[] args) {
		int count= 0, num= 123456;
		for(;num!=0;num /=10,++count) {}
			System.out.println("number of digit:"+ count);
	}

}
