package model;

public class Kryptoniano extends Human implements Flyer {

	public Kryptoniano(int a, String n) {
		super(a, n);
	
	}

	@Override
	public String despegar() {
		
		return " Levanta la mano y digo a volar por la justicia";
	}

	@Override
	public String aterrizar() {
		
		return " Cae de pie";
	}

	@Override
	public String volar() {
		
		return " Estira la mano derecha";
	}

}
