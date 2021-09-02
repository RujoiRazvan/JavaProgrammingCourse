package Part5;

public class Apartment {
	private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared) {
    	if(this.squares >= compared.squares) 
    		return true;
    	return false;
    }
    public int priceDifference(Apartment compared) {
    	int compPrice = compared.pricePerSquare*compared.squares;
    	int price = squares*pricePerSquare;
    	int difPrice = compPrice - price;
    	return Math.abs(difPrice);
    }
    public boolean moreExpensiveThan(Apartment compared) {
    	if(compared.pricePerSquare*compared.squares <= pricePerSquare*squares)
    		return true;
    	return false;
    }
    public String toString() {
    	return " costs " + pricePerSquare*squares;
    }
}
