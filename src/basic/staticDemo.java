package basic;

public class staticDemo {
	int a=30;//
	static int b=70;
	
	void hello() {
		
	}
	
	void m1() {      
            m2();      
		}
	
	
	static void m2() {
		System.out.println("hello m2");
		staticDemo d=new staticDemo();
		d.m1();
		
	}
	public static void main(String[] args) {
         m2();
         staticDemo d=new staticDemo();
         d.m1();
         System.out.println(d.a);
	}

}
