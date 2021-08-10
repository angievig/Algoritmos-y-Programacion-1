package model;

public class Duck extends Bird implements Flyer
{

	public Duck(int a, double ws) {
		super(a, ws);
		
	}

	@Override
	public String makeSound() {
		
		return "cuack";
	}
	
	@Override
	public String despegar() {
		return " abre las alas y salta";
		
	}
	@Override
	public String aterrizar() {
		return " recoge las alas y baja las patas";
	}
	@Override
	public String volar() {
		return " bate las alas";
	}

}
