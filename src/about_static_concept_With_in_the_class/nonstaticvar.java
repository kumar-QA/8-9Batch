package about_static_concept_With_in_the_class;

public class nonstaticvar {

	String a="Non static varaible";
	
	
	void m1() {
		System.out.println(a);
	}
	
	static void m2() {
		nonstaticvar v=new nonstaticvar();
		System.out.println(v.a);
	}
	
	
	public static void main(String[] args) {
		nonstaticvar v=new nonstaticvar();
		v.m1();
		m2();
		
		
	}

}
