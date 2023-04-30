package java_opps_15thApr_2023;

public class Method_Overriding_Child extends Method_Overriding {

	public static void main(String[] args) {
		Method_Overriding_Child child = new Method_Overriding_Child();
		child.display();
		
		Method_Overriding parent = new Method_Overriding();
		parent.display();
		
	}

	public static void display() {
		System.out.println("child's display");
	}
	public static void hello (int i) {
		
	}
}
