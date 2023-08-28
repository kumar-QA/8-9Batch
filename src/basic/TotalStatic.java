package basic;

public class TotalStatic {
  static int a=30;
  int b=70;
  
      void m3() {}
      static void m4() {}
  
     void m1() {
    	 System.out.println(a);
    	 System.out.println(b);
    	 m3();
 
     }
	 static void m2() {
		 System.out.println(a);
//		 System.out.println(b);//Cannot make a static reference to the non-static field b
		 TotalStatic data=new TotalStatic();
		 System.out.println(data.b);
//m3();//Cannot make a static reference to the non-static method m3() from the type TotalStatic
		data.m3(); 
	 }	
	public static void main(String[] args) {
		
	}

}







