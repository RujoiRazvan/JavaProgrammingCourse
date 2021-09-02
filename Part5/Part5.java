package Part5;

import java.util.Scanner;
import java.util.ArrayList;

public class Part5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * Timer timer = new Timer();
	
		while (true) {
		    System.out.println(timer);
		    timer.advance();
	
		    try {
		        Thread.sleep(10);
		    } catch (Exception e) {
	
		    }
		}
		*/
		/*
		Book book1 = new Book("J. K. Rowling", "Harry Potter and the Sorcerer's Stone", 223);
		System.out.println(book1);
		*/
		/*
		Cube oSheaJackson = new Cube(4);
		System.out.println(oSheaJackson.volume());
		System.out.println(oSheaJackson);

		System.out.println();

		Cube salt = new Cube(2);
		System.out.println(salt.volume());
		System.out.println(salt);
		*/
		
		/*
		Fitbyte assistant = new Fitbyte(30, 60);

		double percentage = 0.5;

		while (percentage < 1.0) {
		    double target = assistant.targetHeartRate(percentage);
		    System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
		    percentage = percentage + 0.1;
		}
		*/
		/*
		Product tapeMeasure = new Product("Tape measure");
		Product plaster = new Product("Plaster", "home improvement section");
		Product tyre = new Product("Tyre", 5);

		System.out.println(tapeMeasure);
		System.out.println(plaster);
		System.out.println(tyre);
		*/
		/*
		Counter counter = new Counter(10);
		System.out.println(counter.value());
		counter.decrease();
		System.out.println(counter.value());
		counter.increase();
		counter.increase();
		counter.increase();
		System.out.println(counter.value());
		counter.decrease(5);
		counter.increase(2);
		System.out.println(counter.value());
		*/
		
		/*
		PaymentCard petesCard = new PaymentCard(10);

        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());
        */
		
		/*
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change " + change);

        System.out.println(unicafeExactum);
        */
		/*
		 PaymentTerminal unicafeExactum = new PaymentTerminal();

	        double change = unicafeExactum.eatAffordably(10);
	        System.out.println("remaining change: " + change);

	        PaymentCard annesCard = new PaymentCard(7);

	        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
	        System.out.println("there was enough money: " + wasSuccessful);
	        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
	        System.out.println("there was enough money: " + wasSuccessful);
	        wasSuccessful = unicafeExactum.eatAffordably(annesCard);
	        System.out.println("there was enough money: " + wasSuccessful);

	        System.out.println(unicafeExactum);
		 */
		/*
		 PaymentTerminal unicafeExactum = new PaymentTerminal();
	        System.out.println(unicafeExactum);

	        PaymentCard annesCard = new PaymentCard(2);

	        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

	        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
	        System.out.println("there was enough money: " + wasSuccessful);

	        unicafeExactum.addMoneyToCard(annesCard, 100);

	        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
	        System.out.println("there was enough money: " + wasSuccessful);

	        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

	        System.out.println(unicafeExactum);
	        */
		/*
		Pet lucy = new Pet("Lucy", "golden retriever");
		Person leo = new Person("Leo", lucy);

		System.out.println(leo);
		*/
		
		/*
		Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
		Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
		Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

		System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));       // false
		System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true
		
		System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
		System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400
	
		System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
		System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true
		*/
		
		/*
		Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
		Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

		if (jackSparrow.equals(anotherSparrow)) {
		    System.out.println("Songs are equal.");
		}

		if (jackSparrow.equals("Another object")) {
		    System.out.println("Strange things are afoot.");
		}
		*/
		
		
		/*
		ArrayList<Book> books = new ArrayList<>();
		while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Author: ");
            String author = scanner.nextLine();
            System.out.println("Pages: ");
            int pages = scanner.nextInt();
            System.out.println("Publication year:");
            int publicationYear = scanner.nextInt();
            Book book = new Book(author, name, pages, publicationYear);
            
            if(books.contains(book)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
                continue;
            } else {
                books.add(book);
            }

        }
		 System.out.println("Thank you! Books added: " + books.size());
		 */
		
		/*
		ArrayList <Arhive> arhives = new ArrayList<>();
		while(true) {
			System.out.println("Identifier ?");
			String identifier = scanner.nextLine();
			if(identifier.isEmpty())
				break;
			System.out.println("Name ?");
			String name = scanner.nextLine();
			if(name.isEmpty())
				break;
			Arhive arhive = new Arhive(name, identifier);
			if (arhives.contains(arhive)) {
                continue;
            } else {
                arhives.add(arhive);
            }

		}
		System.out.println("====Items====");
		for (Arhive entry : arhives) {
			System.out.println(entry.getIdentifier() + ": " + entry.getName());
		}
		*/
		
		/*
		SimpleDate date = new SimpleDate(13, 2, 2015);
	    System.out.println("Friday of the examined week is " + date);
	    date.advance();
	    date.advance();
	    System.out.println(date);
	    date.advance();
	    System.out.println(date);
	    date.advance();
	    System.out.println(date);
	    date.advance();
	    System.out.println(date);
	    date.advance();
	    System.out.println(date);
	    date.advance();
	    System.out.println(date);
	    date.advance();
	    System.out.println(date);
	    date.advance();
	    System.out.println(date);
	    date.advance();
	    System.out.println(date);
	    date.advance();
	    System.out.println(date);
	    date.advance();
	    System.out.println(date);
	    SimpleDate newDate = date.afterNumberOfDays(7);
	    int week = 1;
	    while (week <= 7) {
	        System.out.println("Friday after " + week + " weeks is " + newDate);
	        newDate = newDate.afterNumberOfDays(7);

	        week = week + 1;
	    }
	    */
		
	    /*
	    Money a = new Money(10,0);
	    Money b = new Money(5,0);
	    
	    Money c = a.plus(b);

	    System.out.println("a " + a);  // 10.00e
	    System.out.println("b " + b);  // 5.00e
	    System.out.println("c " + c);  // 15.00e

	    a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
	    //  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it

	    System.out.println(a);  // 25.00e
	    System.out.println(b);  // 5.00e
	    System.out.println(c);  // 15.00e
	    */
		/*
	    Money a = new Money(10, 0);
	    Money b = new Money(3, 0);
	    Money c = new Money(5, 0);

	    System.out.println(a.lessThan(b));  // false
	    System.out.println(b.lessThan(c));  // true
	    */
		
		Money a = new Money(10, 0);
		Money b = new Money(3, 50);

		Money c = a.minus(b);

		System.out.println(a);  // 10.00e
		System.out.println(b);  // 3.50e
		System.out.println(c);  // 6.50e

		c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
		//  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it


		System.out.println(a);  // 10.00e
		System.out.println(b);  // 3.50e
		System.out.println(c);  // 0.00e
	    
	}
	
}
