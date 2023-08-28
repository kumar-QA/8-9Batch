package strings;

public class AboutMethods {

	public void addingTwoNumber(int a, int b) {
		System.out.println("adding of two numbers; "+(a+b));
	}//method implementations
	
	public void subTwoNumber(int a, int b) {
		System.out.println("sub of two numbers; "+(a-b));
	}//method implementations
	
	
	
	
	public static void main(String[] args) {
		AboutMethods a=new AboutMethods();
		a.addingTwoNumber(10,40);//Method calling
		a.subTwoNumber(100, 50);
	}

}
