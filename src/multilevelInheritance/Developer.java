package multilevelInheritance;

public class Developer extends Employee {
	
	String programmingLanguage;
	
	Developer(){
		
	}
	
	Developer(String name,int age,int employeeId,double salary,String programmingLanguage){
		super(name,age,employeeId,salary);
		this.programmingLanguage = programmingLanguage;
	}
	
void displayDeveloper() {
	System.out.println("Programming language:"+programmingLanguage);
}


public static void main(String[] args) {
	Developer developer = new Developer();
	Developer developer1 = new Developer("natheem",23,34,45,"java");
//	developer1.displayPerson();
//	developer.displayEmployee();
//	developer.programmingLanguage="java";
//	System.out.println(developer.programmingLanguage);	
}
}
