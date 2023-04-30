package learningjava_11th_March_2023;

public class InDepth_Understanding_MainMethod {

	//why is main method always public?
		//it allows access to all the class
	//if I swap the reserved keywords public static to static public will it work? yes
	//you are not allowed to change nomenclature of main to anything else. main remains main
	
	
	
	public static void main(String[] args) {
		System.out.println("this is the main method");
		
		

	}

	public static void temp() {
		System.out.println("this is the temp method");
	}
}
