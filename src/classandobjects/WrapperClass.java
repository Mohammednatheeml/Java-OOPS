package classandobjects;

public class WrapperClass {
	
//	static void swap(int a,int b) {
//		int temp = a;
//		a = b;
//		b = temp;
//
//	}
//	
	
	static void swap(Integer a,Integer b) {
		Integer temp = a;
		a = b;
		b = temp;

	}
	
	
	public static void main(String[]args) {
//		
//		int a = 10;
//		int b = 20;
//		
//		System.out.println(a);
//		System.out.println(b);
//		swap(a,b);
		
		
//		A wrapper class converts a primitive data type into an object.
		Integer a = 10;
		Integer b = 20; //Here Integer is an object
		
		System.out.println(a);
		System.out.println(b);
		
		swap(a,b);
		
		
	}
}
