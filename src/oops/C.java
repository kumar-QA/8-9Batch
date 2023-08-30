package oops;

public class C extends B{
	
	void build() {
		System.out.println("restuarant");
	}

	public static void main(String[] args) {
//     A a=new A();
//     a.build();
//     B b=new B();
//     b.build();
//		A a=new C();
//		a.build();
		A a=new B();
		a.build();
		
	}

}
