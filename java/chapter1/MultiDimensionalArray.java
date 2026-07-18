package chapter1;

public class MultiDimensionalArray {

	public static void main(String[] str) {
		
		int[][] y ={ 
						{10,20,30}, //0
						{40,50,60}, //1
						{70,80,90}  //2
					//	 0   1   2  
					};
		
		System.out.println(y.length);
		System.out.println(y[1].length);
		
		int d = 0;
		
		for(int row=0; row<y.length; row++) {
			
			for(int col=0; col<y[row].length; col++) {
				System.out.print(y[row][col] + "\t");
				if(row == col) {
					d = d + y[row][col];
				}
			}
			
			System.out.println();
		}
		
		System.out.println(d);	
	}
}
