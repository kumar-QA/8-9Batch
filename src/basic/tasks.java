package basic;

public class tasks {

	public static void addOrEven(int value) {
		if(value%2==0)
			System.out.println("even number");
		else
			System.out.println("odd  number");
		}
	
	public static void majorOrMinor(int age) {
		if(age>18)
		System.out.println("major");	
		else
		System.out.println("minor");
	}
	
	public static void main(String[] args) {
		addOrEven(20);
		addOrEven(33);
		majorOrMinor(40);
		majorOrMinor(10);
		
		
		
	}

}
