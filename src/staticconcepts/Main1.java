package staticconcepts;

public class Main1 {

	public static void main(String[] args) {
		
//		 greeting(); // It give me error because  greeting method is non static and main method is static
		             //A static method can access only static data. It cannot access non-static data (instance variables)
//		 A non-static member belongs to an instance. It's meaningless without somehow resolving which instance of a class you
//		 are talking about. In a static context, you don't have an instance, that's why you can't access a non-static member
//		 without explicitly mentioning an object reference.
		
		 //In fact, you can access a non-static member in a static context by specifying the object reference explicitly :
		
		Main1 main = new Main1();
		main.greeting();
		
		Main1 funn = new Main1();
		funn.fun1();
	}
	
	
	
	//we know if some member is non static, its belongs to object
//	void greeting() {
//		System.out.println("Hello World !");
//	}
	
	//Simply namma non static member ah static method kulla use panna mudiyathu , use pannanum na andha method ah static ah mathanum apd ilanna 
	//object create pannanum because non static epomey object depend pannadha than irukum but static class depend pannum
	
	//for example--> indha example ah fun method static and adhukulla ulla greeting methon non static 
					//non static epomey object depend panni dhan irukum soo static kulla non static use pannanum na namma object create pannanum 
				  //andha bject vachi  create pananum --> obj.greeting();
	static void fun() {
		
		Main1 obj = new Main1();
		obj.greeting();
	}
	
	//epd object create panrathuna ..see line number 15 and 16...psvm epomey static ah than irukum en ah namma epomey anga object create pani than use panvom 
	//For example indha example ah fun vandhu non static soo namma idhuku main la object create panni dhan aahanum  ..see line 18 and 19
	void fun1() {
		greeting();
	}
	
	
	 void greeting() {
		System.out.println("Hello World !");
	}

}
