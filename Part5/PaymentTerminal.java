package Part5;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000.00;
    }

    public double eatAffordably(double payment) {
    	if(payment >= 2.50) {
    		money = money + 2.50;
    		payment = payment - 2.50;
    		affordableMeals++;
    		return payment;
    	}
    	return payment;
    }

    public double eatHeartily(double payment) {
       if(payment >= 4.3) {
    	   money += 4.3;
    	   heartyMeals++;
    	   payment -= 4.3;
    	   return payment;
       }
       return payment;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        if(card.balance() >= 2.50) {
        	card.takeMoney(2.50);
        	this.affordableMeals++;
        	return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if(card.balance() >= 4.30) {
        	card.takeMoney(4.30);
        	this.heartyMeals++;
        	return true;
        }
        return false;	
    }
    public void addMoneyToCard(PaymentCard card, double sum) {
    	if(sum >= 0) {
    		this.money = this.money + sum;
    		card.addMoney(sum);
    	}
    }
}
