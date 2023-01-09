package ImportPackageModifiers;

import PackageModifiers.A;

class D extends A{
	public static void main(String args[]) {
		PackageModifiers.A obj = new PackageModifiers.A();// using fully qualified name
		obj.msg();
		PackageModifiers.Simple2 s1=new PackageModifiers.Simple2();
	}
}