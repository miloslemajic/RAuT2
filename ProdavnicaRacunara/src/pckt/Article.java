package pckt;

public abstract class Article {

	
	String code;
	String name;
	double price;
	
	public Article (String code, String name, double price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	@Override
	 public String toString(){
		return code + ", " + name + ", " + price;
	}
	
	
}
	