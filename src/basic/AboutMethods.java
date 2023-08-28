package basic;

public class AboutMethods {
int a=22;

       void m1() {
    	   int a=333;
    	   System.out.println(this.a);
       }

	public static void main(String[] args) {
		
		AboutMethods s=new AboutMethods();
		s.m1();
	}

}
