package Constructor;

class Example2{
	int roll;
	double salary;
	Example2(int r,double s){
		this.roll=roll;
		this.salary=salary;
	}
	void display() {
		
		System.out.println("roll"+roll );//101,2500 201 5500
		System.out.println("salary"+salary );
	}
	public static void main(String args[]) {
		Example2 c1 = new Example2(20,10);
		c1.display();
		Example2 c2 = new Example2(30,50);		
		c2.display();
	}
}