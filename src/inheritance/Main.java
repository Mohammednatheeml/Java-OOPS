package inheritance;

public class Main {
	public static void main(String[] args) {
//		Box box = new Box(5 , 4 , 3);
		BoxWeight boxWeight = new BoxWeight(3,4,5,7);
		
		System.out.println(boxWeight.l  +boxWeight.h +boxWeight.w +boxWeight.weight);
		
//		System.out.println(box.l +" "+ box.h +" "+ box.w);
	}
}
