package pckt;

public class Component extends Article {
	
	protected String category;
	
	public Component (String category, String name, String code, double price) {
		super (code,name,price);
		this.category = category;
	}
	@Override
	public String toString() {
		return category + ", " + super.toString();
	}
}
