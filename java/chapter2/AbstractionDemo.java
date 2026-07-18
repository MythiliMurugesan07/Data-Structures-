package chapter2;

public class AbstractionDemo {

	public static void main(String[] str) {
	
		Car c = new Car();
		c.vehicleInfo();
		c.basicInfo();
		
		
	}
}

abstract class Vehicle {
	
	public void basicInfo() {
		
		System.out.println("Wheels : 2 or 4");
		System.out.println("Engine : 1"); 
	}
	
	abstract public void vehicleInfo();	//function declaration
	
}

class Car extends Vehicle {
	
	Student st = new Student();
	
	public void vehicleInfo() {
		
		System.out.println("Vehicle Type : CAR");
		System.out.println("Engine : Ford Engine");
	}
}
