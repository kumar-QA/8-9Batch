package basic;

public class Employe {
	String Emp_name;//global
	int Emp_id;//global
    static String companyName="Tcs";//static global
	
	Employe(String Emp_name,int Emp_id ){
		this.Emp_name=Emp_name;
		this.Emp_id=Emp_id;
	}
	
	static void m1() {
		
	}//static method
	
	void empdetails() {
		System.out.println("Employee Name:"+this.Emp_name);
		System.out.println("Employee id"+Emp_id);
	}//non-Static method
	
	public static void main(String[] args) {
	Employe e=new Employe("prasanna", 102);	
	System.out.println(e.companyName);
	Employe e1=new Employe("kumar", 103);
	System.out.println(e1.companyName);
	Employe e2=new Employe("A", 104);
	Employe e3=new Employe("B", 105);
	Employe e4=new Employe("c", 106);
	Employe e5=new Employe("D", 107);
	Employe e6=new Employe("E", 108);
	Employe e7=new Employe("F", 109);
	
	}
}
