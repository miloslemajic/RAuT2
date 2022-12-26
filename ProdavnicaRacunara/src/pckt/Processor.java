package pckt;

public class Processor extends Component{
	
	protected int noOfCores;
	protected double clockRate;
	
	public Processor (String code, String name, double price, double clockRate, int noOfCores) {
		super ("Processor", code, name, price);
		this.clockRate = clockRate;
		this.noOfCores = noOfCores;
	}
	@Override
	public String toString() {
		return super.toString() + ", " + clockRate + ", " + noOfCores;
	}

}
