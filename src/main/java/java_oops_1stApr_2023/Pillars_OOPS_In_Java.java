package java_oops_1stApr_2023;

public class Pillars_OOPS_In_Java {
	// oops - object oriented programming [system or structure]
		//6pillars of OOPS in java
			//1. Classes and Objects
			//2. Methods
			//3. Inheritance
			//4. Polymorphism
			//5. Abstraction
			//6. Encapsulation
		//Class of collection of methods
		//User-defined class can call user-defined methods directly only and only if static keyword is associated with the method
		//What happens to the method which does not have static associated with it?
		//Class says make an object and using the Object reference call that method which does not have static associated with it
		//Class is also a collection of Objects
		//Bookish definition of Class - it is a blueprint or a template and it will go with connection to Object and its properties
		//Class is a logical entity. it is not a physical entity
		//Class does not occupy memory space
	
	
	
		//Ways to created Object in Java
		//1. using new keyword
		//2. newInstance() method
		//3. clone() method
		//4. deserialization
		//5. factory method
	
		// Object is nothing but instance of a Class
		// Object is also a physical entity
		// Object occupies memory space
		// Object is created using new keyword so the memory allocated is in Heap Area
		// Object has certain properties:
			//1. identification [name]
			//2. State [Breed, color, age] 'dog'
			//3. Behavior [barking, sleeping, eating, running]
	
		//categorization of Object is simpler compared to class
		//Object is collection of all non static entities of Class
	
	
	public static void main(String[] args) {
		Pillars_OOPS_In_Java.sample();
		//how to create an Object using the ClassName and new keyword
		
		Pillars_OOPS_In_Java objref = new Pillars_OOPS_In_Java();
		objref.testSample();
		
		Pillars_OOPS_In_Java objref1 = new Pillars_OOPS_In_Java();
		Pillars_OOPS_In_Java objref2 = new Pillars_OOPS_In_Java();
		Pillars_OOPS_In_Java objref3 = new Pillars_OOPS_In_Java();
		
	}

	public static void sample() {
		System.out.println("This is sample method");
		System.out.println(100-90);
	}
	
	public void testSample() {
		System.out.println("This is test sample method");
	}
}
