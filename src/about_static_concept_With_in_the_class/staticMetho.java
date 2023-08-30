package about_static_concept_With_in_the_class;

public class staticMetho {

	
	static void m1() {
	System.out.println("static method");	
	}
	
	 void m2() {
		 m1();
	 }
	 
	 static void m3() {
		 m1();
	 }
	
	public static void main(String[] args) {
		staticMetho v=new staticMetho();
		v.m2();
		 m3();
	}

}
