package oops;

public class AboutMO {
	void add() {
		System.out.println("No-para");
	}
	void add(int a) {
		System.out.println(a);
	}
	void add(int a ,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {}
	void add(String a,String b) {
		System.out.println(a+b);
	}
	void add(int a,String b) {
		
	}
	void add(String a ,int b) {
		
	}
public static void main(String[] args) {
	AboutMO a=new AboutMO();
	a.add("prasanna", "kumar");
	a.add();
	a.add(10);
	a.add(10,20);
}
}
