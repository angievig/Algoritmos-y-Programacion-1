package model;

public abstract class Animal {

	private double height;
	private double weiht;
	private int age;

	public Animal(double height, double weiht, int age) {
		this.height = height;
		this.weiht = weiht;
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setWeiht(double weiht) {
		this.weiht = weiht;
	}

	public double getWeiht() {
		return weiht;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	/**
	 * Define la comunicaciOn del animal
	 *
	 * @return el mensaje con el que se comunica el animal
	 **/
	public abstract String communication();


}
