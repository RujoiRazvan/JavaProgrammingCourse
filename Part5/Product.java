package Part5;

public class Product {
	private String name, location;
	private int weight;
	public Product(String name) {
		this.name = name;
		this.location = "Shelf";
		this.weight = 1;
	}
	public Product(String name, String location) {
		this.name = name;
		this.location = location;
		this.weight = 1;
	}
	public Product(String name, int weight) {
		this.weight = weight;
		this.location = "shelf";
		this.name = name;
	}
	public String toString() {
		return name + " (" + weight + " kg)" + " can be found from the " + location;
	}
}
