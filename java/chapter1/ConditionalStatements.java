package chapter1;

public class ConditionalStatements {

	public static void main(String[] str) {
		
		int x = 300 , y = 300;
		   
		if(x > 50) {
			
			System.out.println("X is greater than 50");
		}
		
		
		if (x > y) { // 300 > 300
			
			System.out.println("X is greater than Y");
		
		}else {
			
			System.out.println("Y is greater than X");
		}
		
		
		if (x > y) {
			
			System.out.println("X is greater than Y");
		
		}else if (y > x) {
			
			System.out.println("Y is greater than X");
	
		}else  {
			
			System.out.println("Both values are equal");
		}
		
		
		/*if(x == y) {
			
			for(int i=0; i<=5; i++) {
				
				if (50 < 100) {
					
				}
			}
		} */
		
		
		int z = 4;
		
		switch(z) {
		
		case 1:
			System.out.println("Triangle");
			break;
			
		case 2:
			System.out.println("Square");
			break;
			
		case 3:
			System.out.println("Rectangle");
			break;
		}
		
		
		
	}
}
