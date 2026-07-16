package chapter1;

public class ArrayDemo {

	public static void main(String[] str) {
		
		//Method #1
		int[] x = new int[3];
		
		x[0] = 50;
		x[1] = 200;
		x[2] = 100;
		
		//Method #2
		int[] y = {10,20,30,40,50,60};
		
		//Accessing an array
		int lenx = x.length;
		int leny = y.length;
		
		System.out.println("Length of X : " + lenx);
		System.out.println("Length of Y : " + leny);
		
		System.out.println("Elements of X ...");
		for(int index=0; index < lenx; index++) {
			System.out.println(x[index]); //50 200 100
		}
		
		System.out.println("Elements of Y ...");
		for(int i=0; i<leny; i++) {
			System.out.println(y[i]);
		}
		
	}
}
