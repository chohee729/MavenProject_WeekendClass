package learningjava_19th_March_2023;

public class PatternProgramming1 {

	public static void main(String[] args) {
	
		System.out.println("-----------------Pattern 1--------------------------------");
		for(int i=1;i<=5;i++) {
			//correct condition
			
			
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------Pattern 2--------------------------------");
		for(int i=1;i<=5;i++) {
			//correct condition
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			
			}
			System.out.println();
	
	}

		System.out.println("-----------------Pattern 3--------------------------------");
		for(int i=1;i<=5;i++) {
			//correct condition
			
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			
			}
			System.out.println();
}
		
		System.out.println("-----------------Pattern 4--------------------------------");
		for(int i=1;i<=5;i++) {
			//correct condition
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			
			}
			System.out.println();
	}
		for(int i=2;i<=5;i++) {
			//correct condition
			
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			
			}
			System.out.println();
}
	
		System.out.println("-----------------Pattern 5--------------------------------");
		for(int i=1;i<=5;i++) {
			
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------Pattern 6--------------------------------");
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++)
				System.out.print("*");
			
			System.out.println();
		
		}
		
		System.out.println("-----------------Pattern 7--------------------------------");
		for(int i=1;i<=5;i++) {
			
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
				System.out.print("*");
			
			System.out.println();
		}
			for(int i=1;i<=5;i++) {
				
				for(int j=1;j<=i;j++) {
					System.out.print(" ");
				}
				for(int j=i;j<=5;j++)
					System.out.print("*");
				
				System.out.println();
	}
}
	

}