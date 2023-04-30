package java_opps_15thApr_2023;


public class Student {

	String name;
	int age;
	int height;
	int weight;
	int studentid;
	String eyecolor;
	String state;
	String gender;
	String subject;
	int phonenumber;
	
	public static void main(String[] args) {
		Student s1 = new Student ("Sam", 32, 179, 87, 001, "brown", "NJ", "M", "Economics", 2386);
		System.out.println(s1.name + "--" + s1.age + "--" + s1.height + "--"+ s1.weight + "--"+ s1.studentid + "--"+ s1.eyecolor+ "--" + s1.state+ "--" + s1.gender+ "--" + s1.subject+ "--" + s1.phonenumber );

		Student s2 = new Student("Cho", 30, 158, 42, 002, "brown", "NY", "F", "Science", 9530);
		System.out.println(s2.name+ "--" + s2.age+ "--" + s2.height+ "--" + s2.weight+ "--" + s2.studentid+ "--" + s2.eyecolor+ "--" + s2.state+ "--" + s2.gender+ "--" + s2.subject+ "--" + s2.phonenumber );		
		
		Student s3 = new Student("CH", 29, 167, 57, 003, "black", "PA", "F", "Psycology", 1215);
		System.out.println(s3.name+ "--" + s3.age+ "--" + s3.height+ "--" + s3.weight+ "--" + s3.studentid+ "--" + s3.eyecolor+ "--" + s3.state+ "--" + s3.gender+ "--" + s3.subject+ "--" + s3.phonenumber );
	}

	public Student (String name, int age, int height, int weight, int studentid, String eyecolor, String state, String gender, String subject, int phonenumber) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.studentid = studentid;
		this.eyecolor = eyecolor;
		this.state = state;
		this.gender = gender;
		this.subject = subject;
		this.phonenumber = phonenumber;
		
	}
	
}
