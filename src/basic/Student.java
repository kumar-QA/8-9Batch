package basic;

public class Student {
 String St_name;
 int St_Id;
 Student(String St_name,int St_Id){
	 this.St_name=St_name;
	 this.St_Id=St_Id;
 }
 	
	public static void main(String[] args) {
		Student[ ] st = new Student[5000];
		st[0]=new Student("xyz",123);
		st[1]=new Student("abc",143);
		
	}

}
