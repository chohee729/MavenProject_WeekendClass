package learningjava_19th_March_2023;

public class MoreOnForLoops {

	public static void main(String[] args) {
		//for loop inside for loop
		
		
		for (int i=1; i<=2;i++) { //outer for loop represents Rows
			//nested for loop
			
			for(int j=1;j<=5;j++) { //inner for loop represents Cols
				//body of the inner for loop
				System.out.println("Hello");
			}
		//this is the body of outer for loop
			System.out.println("Row");
		}
		

	}

}
