package model;

public abstract class Mammal extends Animal {

	private String name;

	public Mammal(double weight, double height, int age, String name) {
		super(weight, height, age);
		this.name = name;
	}

    public String getName(){
        return name;
    }

}
