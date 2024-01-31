package model;

public class Felidae extends Mammal implements IMove{

	private boolean isDomestic;
	private Species species;

	public Felidae(double weight, double height, int age, String name, Species species) {
		super(weight, height, age, name);
		if (species == Species.CAT){
			this.isDomestic = true;
		}
		else{
			this.isDomestic = false;
		}
		this.species = species;
	}

	public boolean getIsDomestic() {
		return isDomestic;
	}

	public Species getSpecies() {
		return species;
	}

	@Override
	public String communication() {
		return "Grunts... and gets into a box...";
	}

	@Override
	public String jump() {
		return "Jumping!!";
	}

	@Override
	public String run() {
		return "Running!!";
	}

}
