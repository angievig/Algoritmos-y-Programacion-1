package model;

public class HomoSapiens extends Human {

	public HomoSapiens(double weight, double height, int age, String name) {
		super(weight, height, age, name);
		
	}
	
	public String toString() {
		return "I'm a modern Human, my name is: " + super.name;
	}

}
