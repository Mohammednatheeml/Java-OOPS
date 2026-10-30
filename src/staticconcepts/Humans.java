package staticconcepts;

public class Humans {
	
	String name;
	int age;
	int salary;
	boolean married;
	static long population;
//3	long population; //here the population is same for every humans 
	
//1//	The static keyword is used to make a variable, method, block, or nested class belong to the class rather than to individual objects.
// 2 For Ex: here also there is the human template that contain name age salary but in this world 
           // population is common for every human ...in main class i created natheem and ashik object
	      //the population is common for both humans (natheem and ashik) not only them ...for every humans 
	     //soo here population is not logically related to object so it is object independent
	
	//In simple words ..such property that  are not directly relaed to object it is known as Static.
	public Humans(String name, int age, int salary, boolean married) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.married = married;
		Humans.population +=1; //4 i already told population is same for every human bu i use this keyword because to point the object
							//this.population +=1; --> Natheem.population , Ashik.population
							// i already said static variable is not related to object so we cant use this keyword
							// instead we can use class name
	}
	
	
}
