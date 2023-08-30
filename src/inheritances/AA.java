package inheritances;

public class AA {

	int s=333;
	public static void main(String[] args) {
		
	}

}

class BB extends AA{
	int f=333;
	public static void main(String[] args) {
		BB b=new BB();
		System.out.println(b.s);
		System.out.println(b.f);
	}
}

class cc extends AA{
	int z=5456;
	
	public static void main(String[] args) {
		StringBuffer  s=new StringBuffer("kumar");
		StringBuffer  s1=new StringBuffer("kumar");
		Object o=new Object();
	
		System.out.println(s.equals(s1));
		
	}
}
