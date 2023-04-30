package learningjava_18th_March_2023;

public class Understanding_ForLoops {

	public static void main(String[] args) {
		// for(initialize ; condition ; inc/dec
		// programming logic
		//}
		
		 //Flow of logic
		
		//step: initialize value is taken into consideration
		//step2: check for the condition
		//step3: if the condition is true, the control flow will go inside the body of the loop
		//step4: if the condition is false, then it will exit
		//step5: then control goes to iteration and it is compared with the condition
		//step6: then the logic goes back in the same flow till the condition is false
		
		for(int i=1; i<=5;i++) {
			System.out.println("the value of i is :"+ 1 +"");
	}

		//print 1 to 20 using for loop
	
		for (int i=1; i<=20; i++) {
			System.out.println(i+"");
		}
		
		//print first 10 multiples of 5 using for loop
		
		for (int i=1; i<=10; i++) {
			System.out.println(i*5+"");
}
		//print starting from 100 and decreasing 10 till 0
		
		for (int i=100; i>=0; i--) {
			System.out.println(i+"");
		}
		
		//print first 20 multiples of 2 and add all the values and give the sum
		
		int sum=0;
		for (int i=2; i<=20; i++) {
			System.out.println(sum=sum+(i*2));
		}
}
	
}
