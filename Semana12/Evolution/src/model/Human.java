package model;

public class Human extends Mammal implements IMove {

	public Human(double weight, double height, int age, String name) {
		super(weight, height, age, name);
		/** la palabra reservada super llama al (los) constructor(es) de la(s) */
		/**   clase(s) superior(es) */

	}
	
	/** la etiqueta '@override' indica que el metodo ha sido sobre escrito */
	/**   de la clase superior a la clase padre  */
	@Override
	public String communication() {
		return "I'm only human after all ...";
	}

    /** en este caso el mEtodo ha sido sobre escrito de la interfaz que implementa  */
	@Override
	public String jump() {
		return "I'm Jumping";
	}

	@Override
	public String run() {
		return "I'm running!!";
	}
	
    /** todas las clases de java heredan por defecto de 'Object' el  */
    /**     metodo toString es un metodo abstracto de Object */
	public String toString(){
		return "name: " + super.name;
		
	}
	
}

