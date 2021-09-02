package Part5;

public class Fitbyte {
	int age, restingHeartRate;
	double targetHeartRate, maximumHeartRate;
	public Fitbyte(int age, int restingHeartRate) {
		this.age = age;
		this.restingHeartRate = restingHeartRate;
	}
	public double targetHeartRate(double percentageOfMaximum) {
		maximumHeartRate = 206.3 - (0.711 * age);
		targetHeartRate = (maximumHeartRate-restingHeartRate)*percentageOfMaximum + restingHeartRate;
		return targetHeartRate;
	}
}
