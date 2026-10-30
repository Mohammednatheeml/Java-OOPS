package inheritance;

public class BoxWeight extends Box {
	double weight;
	
	public BoxWeight() {
		this.weight = -1;
	}
	
	BoxWeight(double l,double h,double w,double weight){
		super(l,h,w); //it will call the parent class constructor
		this.weight = weight;
	}
	
	BoxWeight(double side,double weight){
		super(side); //it will call the parent class constructor
		this.weight = weight;
	}
	
	
}
