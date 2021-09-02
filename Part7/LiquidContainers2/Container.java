package Part7.LiquidContainers2;

import java.util.ArrayList;

public class Container {
	private int totalAmount = 0;
	private int maximumAmount = 100;
	public Container() {
		this.totalAmount = 0;
	}
	public int contains() {
		return this.totalAmount;
	}
	public void add(int amount) {
		if(amount > 0) {
			if(totalAmount + amount > maximumAmount)
				totalAmount = 100;
			else
				totalAmount+=amount;
		}
	}
	public void remove(int amount) {
		if(amount > 0) {
			if(totalAmount - amount < 0)
				totalAmount = 0;
			else
				totalAmount-=amount;
		}
	}
	public String toString() {
		return totalAmount + "/" + maximumAmount;
	}
}
