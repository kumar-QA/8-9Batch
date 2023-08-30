package inheritances;

public class A {
int a=12;
	
	public static void main(String[] args) {
		A data=new A();
		System.out.println(data.a);
//		System.out.println(data.z);//
//		System.out.println(data.s);//
	}
}

class B extends A{
	int z=23;
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.a);
		System.out.println(b.z);
//		System.out.println(b.s);//it is not possible
	}
}

class c extends B{

	int s=345;
	public static void main(String[] args) {
		
		c data=new c();
		System.out.println(data.a);
		System.out.println(data.z);
		System.out.println(data.s);
	}
}