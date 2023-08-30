package oops;

public class B extends A {
   
	 void build() {
		 System.out.println("s/w company");
	 }
	
	public static void main(String[] args) {
//	   A a=new A();
//	   a.build();
//	   B b=new B();
//	   b.build();
	   
	   A a=new B();
	   a.build();
	}

}
