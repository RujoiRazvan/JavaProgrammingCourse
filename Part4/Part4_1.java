package Part4;

import java.util.Scanner;

public class Part4_1 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		/*Account artosAccount = new Account("Arto's account", 100.00);
		Account MatthewsAccount = new Account("Matthew's account", 1000.00);
		Account myAccount = new Account("My Account", 0);
		*/
		/*System.out.println("Initial state");
		System.out.println(artosAccount);

		artosAccount.withdraw(20);
		System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
		
		System.out.println("End state");
		System.out.println(artosAccount);
		*/
		/*
		System.out.println("Initial state");
		System.out.println(MatthewsAccount);
		
		MatthewsAccount.withdraw(100);
		myAccount.deposit(100);
		System.out.println("Do you want to see your current balance ?");
		String yesOrNo = scan.nextLine();
		if(yesOrNo.equals("yes")) {
			System.out.println("The balance of Matthews account is now: " + MatthewsAccount.balance());
			System.out.println("End state");
			System.out.println(MatthewsAccount);
		}
		else {
			System.out.println("End state");
			System.out.println(MatthewsAccount);
		}
		System.out.println("\nThe balance of my account is now: " + myAccount.balance());
		*/
		
		/*
		Whistle duckSound = new Whistle("Kvak");
		Whistle dog = new Whistle("Ham");
		duckSound.sound();
		dog.sound();
		*/
		
		/*
		 * Door alexander = new Door();
		 
		alexander.Knock();
		alexander.Knock();
		*/
		 Debt mortgage = new Debt(120000.0, 1.01);
	        mortgage.printBalance();

	        mortgage.waitOneYear();
	        mortgage.printBalance();

	        int years = 0;

	        while (years < 20) {
	            mortgage.waitOneYear();
	            years = years + 1;
	        }

	        mortgage.printBalance();
	}
}
