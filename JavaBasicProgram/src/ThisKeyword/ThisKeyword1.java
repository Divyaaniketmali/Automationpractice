package ThisKeyword;

class Student {
	int rollno;
	float fee;
	Student(int rollno, float fee) {		
		this.rollno = rollno;
		this.fee = fee;
	}
	void display() {
		System.out.println(rollno + " " +  fee);
	}
}
class ThisKeyword1 {
	public static void main(String args[]) {
		Student s1 = new Student(111, 5000f);
		Student s2 = new Student(112, 6000f);
		s1.display();//
		s2.display();//
	}
}