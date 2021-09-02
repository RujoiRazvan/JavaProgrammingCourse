package Part4;


public class Account {
	String name;
	double value;
	public Account(String name, double value) {
		this.name = name;
		this.value = value;
	}
	public void withdraw(int withdrawValue) {
		value = value - withdrawValue;
		
	}
	public void deposit(int deposit) {
		value = value + deposit;
	}
	public double balance() {
		return value;
	}
}
