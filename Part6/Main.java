package Part6;

import java.util.Scanner;

import Part6.CargoHold.Hold;
import Part6.CargoHold.Item;
import Part6.CargoHold.Suitcase;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//  `````````` MENU ````````
		/*
		Menu menu = new Menu();
		menu.addMeal("Tofu ratatouille");
		menu.addMeal("Chilli coconut chicken");
		menu.addMeal("Chilli coconut chicken");
		menu.addMeal("Meatballs with mustard sauce");

		menu.printMeals();
		menu.clearMenu();

		System.out.println();
		menu.addMeal("Tomato and mozzarella salad");
		menu.printMeals();
		*/
		
		
		
		// ~~~~~~~~  STACK   ~~~~~~~~~~~~~
		/*
		Stack s = new Stack();
		System.out.println(s.isEmpty());
		System.out.println(s.values());
		s.add("Value1");
		s.add("Value2");
		s.add("Value3");
		System.out.println(s.isEmpty());
		System.out.println(s.values());
		*/
		/*
		Stack s = new Stack();
		System.out.println(s.isEmpty());
		System.out.println(s.values());
		s.add("Value1");
		s.add("Value2");
		s.add("Value3");
		System.out.println(s.isEmpty());
		System.out.println(s.values());
		String taken = s.take();
		System.out.println(s.isEmpty());
		System.out.println(s.values());
		System.out.println(taken);
		*/
		
		
		//  ````````````  MessagingService ````````````
		
		
		// ~~~~~~~~~~~~~   GIFTS ~~~~~~~~~~~
		/*
		Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);
        */
		/*
		 Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
		 Gift present = new Gift("Puzzle", 1);
		 Gift jucarie = new Gift("Masinuta", 3);
	     Package gifts = new Package();
	     gifts.addGift(book);
	     gifts.addGift(present);
	     gifts.addGift(jucarie);
	     System.out.println("Total weight of gifts: " + gifts.totalWeight());
	     System.out.println("What is the acces code for the gift box ? (4523)");
	     int value = scanner.nextInt();
	     if(value == 4523) {
		     System.out.println("Gift: " + present);
		     System.out.println("Gift: " + jucarie);
		     System.out.println("Gift: " + book);
	     }
	     else
	    	 System.out.println("You don't have acces to gifts box");
	    	 */
		
		// ~~~~~~~~~~~~~~ Cargo HOLD ~~~~~~~~~~~~~
		/*
		Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);

        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);
        */
		/*
		Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);
        */
		/*
		 Item book = new Item("Lord of the rings", 2);
	        Item phone = new Item("Nokia 3210", 1);
	        Item brick = new Item("brick", 4);

	        Suitcase suitcase = new Suitcase(10);
	        suitcase.addItem(book);
	        suitcase.addItem(phone);
	        suitcase.addItem(brick);

	        System.out.println("The suitcase contains the following items:");
	        suitcase.printItems();
	        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
	    */
		/*
		Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);
        */
		/*
		Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);
        */
		Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
	}
}
