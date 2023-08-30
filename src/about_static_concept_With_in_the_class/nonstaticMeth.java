package about_static_concept_With_in_the_class;

public class nonstaticMeth {

	void m1() {
	System.out.println("m1 method of non static ");	
	}
	
	void m2() {
		m1();
	}
	
	static void m3() {
		nonstaticMeth v=new nonstaticMeth();
		v.m1();
	}
	
	
	
	public static void main(String[] args) {
		nonstaticMeth vv=new nonstaticMeth();
		vv.m2();
		m3();
	}

}
