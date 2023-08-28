package basic;

import java.util.Iterator;

public class constDemo {
	public static void main(String[] args) {
		
//		String[] names= {"prasanna","kumar","abc","asds"};
		String[] names=new String[7];
		names[0]="kumar";
		names[1]="manoj";
		names[2]="lokesh";
		names[3]="pradeep";
		names[4]="priya";
		names[6]="sai";
//	int i=0;	
//	while(i<names.length) {
//		System.out.println(names[i]);
//		i++;
//	}
//	for(String name:names) {
//		System.out.println(name);
//	}
	
	String[][] data=new String[4][3];
	int[][] data1= {{2,3,4,5},{5,66,6,7},{8,933,33,10},{22,3,33,44}};
//		data[0][0]="abc";
//		data[0][1]="bcd";
//		data[0][2]="asas";
//		data[1][0]="dd";
//		data[1][1]="as";
 for (int k=0; k<4; k++)
 {
	 for (int l=0; l<3; l++)
	 {
		System.out.print(data1[k][l]+" "); 
	 }
	 System.out.println();
 }
	
	
	}

}
