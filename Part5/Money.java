package Part5;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money addition) {
		Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
		return newMoney;
	}
    
    public boolean lessThan(Money compared) {
    	if(this.euros < compared.euros)
    		return true;
    	if(this.euros == compared.euros)
    		if(this.cents < compared.cents)
    			return true;
		return false;
    }
    
    public Money minus(Money decreaser) {
    	int newEuros = this.euros - decreaser.euros;
    	int newCents = this.cents - decreaser.cents;
    	 if (newEuros >= 0){
             if (newCents < 0){
                 newEuros = newEuros - 1;
                 newCents = newCents + 100;
             }
         } else {
        	 newEuros = 0;
             newCents = 0;
         }
    	Money newMoney = new Money(newEuros, newCents);
    	return newMoney;
    }
}