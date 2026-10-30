package staticconcepts;

public class Main {

	public static void main(String[] args) {
 		Humans Natheem = new Humans("Natheem", 21, 40000, false);
		Humans Ashik = new Humans("Ashik", 22, 50000, true);
		Humans Rafikhan = new Humans("Ashik", 22, 50000, true);
		
		System.out.println(Natheem.population);
		System.out.println(Ashik.population);
		System.out.println(Rafikhan.population);
 
		//Here whatever we can accesing static variables or do any =thing using static variables that time dont use via objects
		// Access using via its class name because we can access the static variables even if we dont create objects also
		
		System.out.println(Humans.population);
		System.out.println(Humans.population);
		System.out.println(Humans.population);

//		When a member is declared static, it can be accessed before any objects of its class are created,
//		and without reference to any object. You can declare both methods and variables to be static.
//		The most common example of a static member is main( ).
//		main( ) is declared as static because it must be called before any objects exist.
//		Static method in Java is a method which belongs to the class and not to the object.

	}

}
