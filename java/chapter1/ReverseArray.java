package chapter1;

public class ReverseArray {

	public static void main(String[] str) {
		
		int[] x = {10,20,30,40,50};
		
		int s = 0, e = x.length-1;
		
		while(s < e) {
			
			int temp = x[s];
			x[s] = x[e];
			x[e] = temp;
			
			s++;
			e--;
		}
		
		for(int i=0; i<x.length; i++) {
			
			System.out.println(x[i]);
		}
	}
}
