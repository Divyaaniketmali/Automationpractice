package ImportPackageModifiers;

import PackageModifiers.A;
import PackageModifiers.Simple2;

class B {
	public static void main(String args[]) {
		A obj = new A();
		obj.msg();
		System.out.println(A.age);
		Simple2 s1=new Simple2();
	}
}