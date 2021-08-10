package model;

public  class Human extends Mammal{

	public Human(int a, String n) {
		super(a, n);
	}

	@Override
	public String makeSound() {
		
		return name + " says Whaaaa?";
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
