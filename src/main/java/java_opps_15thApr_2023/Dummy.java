package java_opps_15thApr_2023;

public class Dummy extends Concept{

	public static void main(String[] args) {
		//can i create the object of the abstract class? NO
		
		//Reason:-
		//an abstract class cannot be instantiated on its own
		//so it does not make much sense to have instance variables inside abstract class
		
		Concept ref = new Dummy();
		ref.sample();
		ref.world();
		ref.logic(10);
	}
	
	@Override
	public void sample() {
		System.out.println("This is over-ridden, implemented method");
}
	@Override
	public void world() {
		System.out.println("This is over-ridden, implemented method");
}
	@Override
	public void logic(int i) {
		System.out.println("This is over-ridden, implemented method");
}
}