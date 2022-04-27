package model;

public class Chicken extends Bird implements IMove{

	public Chicken(double weight, double height, int age, double wingSpan) {
		super(weight, height, age, weight);
		
	}

	@Override
	public String communication() {
		return "The Chicken cackles";
	}

	@Override
	public String jump() {
		return "Chicken Jumping";
	}

    @Override
    public String run() {
        return "Chicken running... is funny... (?)";
    }

	
}
