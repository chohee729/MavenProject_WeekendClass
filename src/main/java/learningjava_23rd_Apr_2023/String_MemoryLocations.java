package learningjava_23rd_Apr_2023;

public class String_MemoryLocations {

	//Heap Memory - String Condtant Pool or String Literal Pool (SCP/SLP)
	//Stack Memory
	//PC Register
	//Method Area
	//Native Method Area
	
	//Whenever you create an Object using new keyword, the object is stored in the Heap Memory
	//string will hide under heap memory
	
	public static void main(String[] args) {
		String S1 = new String();
		
		String S2 = new String("Java"); //Literal gets stored in SCP/SLP are
		//2 objects will get created. 1 due to new keyword and another one due to literal passed
		
		String S3 = new String("Python");
		
		String S4 = new String("Java");
		

	}

}
