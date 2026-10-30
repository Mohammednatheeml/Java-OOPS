package staticconcepts;


//This is the demo for initialization for the static variables
public class StaticBlock {
	

	//If you need to do computation in order to initialize your static variables,
//	you can declare a static block that gets executed exactly once, when the class is first loaded.
	static int a = 4;
	static int b;
	
	static {
		System.out.println("iam in static block");
		b= a* 5;
	}

	public static void main(String[] args) {
		StaticBlock obj1 = new StaticBlock();
		System.out.println(StaticBlock.a);
		System.out.println(StaticBlock.b);
		
		StaticBlock.b += 3;
		System.out.println(StaticBlock.a);
		System.out.println(StaticBlock.b);
		
		StaticBlock obj2 = new StaticBlock();
		System.out.println(StaticBlock.a);
		System.out.println(StaticBlock.b);
		
		

	}

}


