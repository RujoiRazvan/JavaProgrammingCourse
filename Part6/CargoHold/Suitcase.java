package Part6.CargoHold;

import java.util.ArrayList;

public class Suitcase {
	private int maximumWeight;
	ArrayList<Item> items = new ArrayList<>();
	public Suitcase(int maximumWeight) {
		this.maximumWeight = maximumWeight;
	}
	public void addItem(Item item) {
		if(this.totalWeight() + item.getWeight() <= maximumWeight)
			items.add(item);
	}
	public int totalWeight() {
        int sumOfWeights = 0;
        for (Item entry : items) {
            sumOfWeights += entry.getWeight();
        }

        return sumOfWeights;
    }
	
	public void printItems() {
		for(Item entry : items) {
			System.out.println(entry);
		}
	}
	public String listItems() {
		String list="";
		for(Item entry : items) {
			list += entry.toString() + "\n";
		}
		return list;
	}
	public Item heaviestItem() {
		int maxWeight = -1;
		 Item heaviestObject = this.items.get(0);
		for(Item entry : items) {
			if(entry.getWeight() > maxWeight)
				heaviestObject = entry;
		}
		return heaviestObject;
	}
	
	public String toString() {
		String print="";
		if(items.size()==0)
			print = "no items " + "(" + this.maximumWeight + "kg)";
		if(items.size() == 1) {
			print = "1 item " + "(" + this.maximumWeight + "kg)";
		}
		if(items.size() > 1)
			print = items.size() + " items (" + this.maximumWeight + "kg)";
		return print;
	 }
}
