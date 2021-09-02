package Part6;

import java.util.ArrayList;

public class Gift {
	//ArrayList<String> Gifts;
	private String name;
	private int weight;
	public Gift(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	public String toString() {
		return name + " " + weight + " " + "(kg)";
	}
}
