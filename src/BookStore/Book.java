package BookStore;

public class Book {
	private String ID;
	private String name;
	private double price;
	
	// constructor
	public Book(String iD, String name, double price) {
		super();
		this.ID = iD;
		this.name = name;
		this.price = price;
	}

	
	// get set method
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	// Method show info Book 
	public void showInfo() {
		System.out.println("Book Info: ");
		System.out.println("-ID \t\t:"+this.getID());
		System.out.println("-Name \t\t:"+this.getName());
		System.out.println("-Price \t\t:"+this.getPrice());
	}
}
