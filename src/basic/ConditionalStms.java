package basic;

public class ConditionalStms {

	public static void main(String[] args) {

//		int a[][]= {{22,23,24},{25,26,27},{28,29,30}};
		int a[]= {22,23,24,25,26,27,28,29};
		
//	for (int i = 0; i <3; i++) {
//		for (int j = 0; j < 3; j++) {	
//		 System.out.println(a[i][j]);     
//		}
//	}	
//
		for(int i=0;i<8;i++) {
			System.out.println(a[i]);
		}
		for(int item: a) {
			System.out.println(item);
		}
		
	
//		for(int a1:a) {
//			System.out.println(a1);
//		}
		
	}
}
