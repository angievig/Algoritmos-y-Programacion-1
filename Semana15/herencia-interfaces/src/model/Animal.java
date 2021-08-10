package model;

public abstract class Animal {
	private int age;
	
	
	
	public Animal(int a) {
		age= a;
	}
	
	public abstract String makeSound();
	
	
	public void getOlder(int years) {
		age+= years;
	}
	
	public int getAge() {
		return age;
	}
	
	

}
