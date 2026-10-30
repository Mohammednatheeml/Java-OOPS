package multilevelInheritance;

public class Employee extends Person{
	
	int employeeId;
	double salary;
	
	
	Employee(){
		this.employeeId = 54;
		this.salary = 43;

		
	}
	Employee(String name,int age,int employeeId,double salary){
		super(name,age);
		this.employeeId = employeeId;
		this.salary = salary;
	}
	
	public void displayEmployee() {
		System.out.println("EmployeeId:"+" "+this.employeeId+",salary:"+this.salary);
	}

}
