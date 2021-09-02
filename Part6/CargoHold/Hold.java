package Part6.CargoHold;

import java.util.ArrayList;

public class Hold {
	private int maxWeight;
	private ArrayList<Suitcase> suitcases;
	public Hold(int maxWeight) {
		this.maxWeight = maxWeight;
		this.suitcases = new ArrayList<Suitcase>();
	}
	public void addSuitcase(Suitcase suitcase) {
		if(this.totalWeight() + suitcase.totalWeight() <= maxWeight)
			this.suitcases.add(suitcase);
	}
	
		public int totalWeight() {
	        int sumOfWeights = 0;
	        for (Suitcase entry : suitcases) {
	            sumOfWeights += entry.totalWeight();
	        }

	        return sumOfWeights;
	    }
	public String toString() {
		return suitcases.size() + " suitcases " + "( "  + totalWeight() +  "kg )";
	}
	public void printItems() {
		for(Suitcase entry:suitcases) {
			System.out.println(entry.listItems());
		}
	}
	
}
