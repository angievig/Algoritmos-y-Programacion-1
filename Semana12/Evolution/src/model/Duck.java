package model; 

public class Duck extends Bird implements IFly, IMove {
    
    public Duck(double weight, double height, int age, double wingSpan) {
        super(weight, height, age, wingSpan);
    }

	@Override
	public String communication() {
		return "Quack!!!";
	}

    @Override
    public String takeOff(){
        return run() + " Open the wings... " + jump();
    }
    
    @Override
    public String land(){
        return "tucks up the wings and lowers the legs";
    }

    @Override
    public String fly(){
        return "flaps its wings";
    }

	@Override
	public String jump() {
		return "Jump";
	}

	@Override
	public String run() {
		return "Start Running...";
	}

    public String toString() {
        return "wingSpan: " + super.wingSpan;
    }
}
