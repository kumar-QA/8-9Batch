package basic;

public class AnotherClass {

	     void m5() {
	    	 System.out.println(TotalStatic.a);
	    	 TotalStatic.m2();
	    	 TotalStatic data=new TotalStatic();
	    	 System.out.println(data.a);
	    	 data.m1();
	     }
	     
	     static void m6() {
	    	 System.out.println(TotalStatic.a);
	    	 TotalStatic.m2();
	    	 TotalStatic data=new TotalStatic();
	    	 System.out.println(data.a);
	    	 data.m1();
	     }
	
	
	public static void main(String[] args) {
		

	}

}
