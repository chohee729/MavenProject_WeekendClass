package java_oops_1stApr_2023;

public class Static_NonStatic {

	//Class - static
	//non static - Object level interaction
	
	//static will call static entities
	//static will not call non-static entities
	
	//non-static can interact with static [but with a warning
	public static void main(String[] args) {
		

	}

	public static void sample() {
		int i =10;
		int j = 20;
		int sum = i+j;
		System.out.println(sum);
	}
}
