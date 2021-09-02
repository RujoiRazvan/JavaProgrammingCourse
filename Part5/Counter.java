package Part5;

public class Counter {
	private int startValue, value;
	public Counter(int startValue) {
		this.startValue = startValue;
	}
	public Counter() {
		this.startValue = 0;
	}
	public int value() {
		value = startValue;
		return value;
	}
	public void increase() {
		startValue = startValue + 1;
	}
	public void decrease() {
		startValue = startValue - 1;
	}
	public void increase(int increaseBy) {
		startValue = startValue + increaseBy;
	}
	public void decrease(int decreaseBy) {
		startValue = startValue - decreaseBy;
	}
}
