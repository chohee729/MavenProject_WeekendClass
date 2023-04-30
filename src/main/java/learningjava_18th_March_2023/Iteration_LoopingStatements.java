package learningjava_18th_March_2023;

public class Iteration_LoopingStatements {

	//while
	//for loop
	//nested for loop
	//advanced for loop
	
	public static void main(String[] args) {
		
		//print the first 10 natural numbers
		//1.....10
		
		//while loop syntax
		//step1: you have to initialize a value of a variable
		//step2: you have to pass the condition in the while
		//step3: if your condition is true, the control will go inside the body of the while loop
		//step4: if your condition is false, the control will not go inside the body of the while loop
		//step5: to control your logic you may chose to increment or decrement a certain value

		boolean b1 = true;
		
		while (b1!=false) { 
			System.out.println("The grass is green");
			break;
			
		}
		//print the first 10 natural numbers using while loop
			//1...10
		
		int i=1;
		while(i<=10) {
			System.out.println(i+"");
			i++;
		}
		
		//print numbers backward from 20 to 1 using while loop

		int j=20;
		while (j>0) {
			System.out.println(j+"");
			j--;
			
		}
		
		int k=1;
		while (k<=20) {
			System.out.println(k*2+"");
			k++;
			
		}
			
		int y=100;
		while(y>=1) {
			System.out.println(y+"");
			y=y-5;
			
		}
}
}
