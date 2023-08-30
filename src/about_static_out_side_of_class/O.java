package about_static_out_side_of_class;

public class O {

	void m1() {
		System.out.println(StaticVar.s);
		StaticMethod.M1();
		NonStaticVar v=new NonStaticVar();
		System.out.println(v.non);
		NonstaticMeth m=new NonstaticMeth();
		m.add();
		
	}
	
	static void m2() {
		StaticMethod.M1();
		NonStaticVar v=new NonStaticVar();
		System.out.println(v.non);
		NonstaticMeth m=new NonstaticMeth();
		m.add();	
		
	}
	
	
	public static void main(String[] args) {
	   	System.out.println(StaticVar.s);
	   	O ref=new O();
	   	ref.m1();
	   	m2();
	   	
	}

}
