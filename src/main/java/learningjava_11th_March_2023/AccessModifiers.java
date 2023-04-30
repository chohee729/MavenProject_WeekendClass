package learningjava_11th_March_2023;

public class AccessModifiers {

	public static int age = 20;
	private static String name = "Don";
	protected static double height = 6.0;
	String color = "Red";
	
	public static void main(String[] args) {
		//There are 4 access modifiers in java
		
		//1. Public - is everywhere across the project
		//2. Protected - access is within the package. It can have access outside the package 
						//but the condition is that you have to have a Child class.
		//3. Private - this is strictly within the same Class
		//4. Default - only within the package
		
		

	}

	public static void sample() {
		System.out.println("This is public sample method");
	}
	protected static void sample1() {
		System.out.println("This is a protected sample1 method");
	}
	private static void cash() {
		System.out.println("This is a private cash method");
	}
	static void setup() {
		System.out.println("This is a default setup method");
	}
}
