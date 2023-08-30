package about_static_concept_With_in_the_class;

public class staticvar {

    static  String s="Hello";
    
      void add() {
    	  System.out.println(s);
      }
       
      static void add1() {
    	  System.out.println(s);
      }
    
    
	public static void main(String[] args) {
	
		staticvar a=new staticvar();
		a.add();
		add1();
	}

}
