package pckt;

public class Memory extends Component {
	
	protected double capacity;
	
	public Memory ( String name, String code, double price, double capacity) {
		super ("Memory", code,name,price);
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return super.toString() + ", " + capacity;
	}

}
