package multilevelInheritance;

public class Person {
	String name;
	int age;
	
	Person(){
		
	}
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void displayPerson() {
		System.out.println("Name:"+" "+this.name+",Age:"+this.age);
	}
}
