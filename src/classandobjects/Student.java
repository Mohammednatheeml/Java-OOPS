package classandobjects;

public class Student {
	
	
	//Class is a Logical Construct.
	String Name;
	int Rollno;
	float marks;
	
	//constructor is a special type of function that runs when you create a object and allocates some variable to it
	
	public Student(String Name,int Rollno,float marks) {
		this.Name = Name;
		this.Rollno = Rollno;
		this.marks = marks;
		
	}
	
	Student(){
		
	};
	
	public static void main(String []args) {
		
		Student student = new Student(); //Object is a Physical Reality And it occupied space in memory
		//NEW keyword dynamically allocates memory and returns a reference to it.
		student.Name = "Natheem";
		student.Rollno = 6;
		System.out.println(student.Name);
		System.out.println(student.Rollno);
		
		
	}
	
		
}
