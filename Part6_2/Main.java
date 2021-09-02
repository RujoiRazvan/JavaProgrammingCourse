package Part6_2;

import java.util.Scanner;

import Part6_2.Averages.GradeRegister;
//import Part6_2.Averages.UserInterface;
import Part6_2.JokeManager.JokeManager;
import Part6_2.JokeManager.UserInterface;

public class Main {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 /*
		 SimpleDictionary dictionary = new SimpleDictionary();

		 TextUI ui = new TextUI(scanner, dictionary);
		 ui.start();
		 */
		 /*
		 Scanner scanner = new Scanner(System.in);
		 SimpleDictionary dictionary = new SimpleDictionary();

		 TextUI textUI = new TextUI(scanner, dictionary);
		 textUI.start();
		 System.out.println(dictionary.translate("pike")); // prints the string "hauki"
		 */
		 /*
		 Scanner scanner = new Scanner(System.in);
		 TodoList list = new TodoList();
		 list.add("read the course material");
		 list.add("watch the latest fool us");
		 list.add("take it easy");

		 list.print();
		 list.remove(2);

		 System.out.println();
		 list.print();
		 
		 UserInterface ui = new UserInterface(list, scanner);
	        ui.start();
	        */
		 /*
		 Scanner scanner = new Scanner(System.in);
		 GradeRegister register = new GradeRegister();
		 
		 register.addGradeBasedOnPoints(93);
		 register.addGradeBasedOnPoints(91);
		 register.addGradeBasedOnPoints(92);
		 register.addGradeBasedOnPoints(88);

		 System.out.println(register.averageOfGrades());
		 System.out.println(register.averageOfPoints());
		 
		 UserInterface ui = new UserInterface(register, scanner);
		 ui.start();
		 */
		 
		 
		 // ~~~~~~~~~~           JOKE MANAGER            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		 
		 JokeManager manager = new JokeManager();
		 /*
		 manager.addJoke("What is red and smells of blue paint? - Red paint.");
		 manager.addJoke("What is blue and smells of red paint? - Blue paint.");
		 manager.addJoke("Erau odata doua baloane prin desert. Un balon ii spune celuilalt: uite un cactussssssss");
		 manager.addJoke("Joke1");
		 manager.addJoke("Joke1");
		 manager.addJoke("Joke2");
		 //System.out.println(manager.getArraySize());
		 System.out.println("Drawing jokes:");
		 for (int i = 0; i < 5; i++) {
		     System.out.println(manager.drawJokes());
		 }

		 System.out.println();
		 System.out.println("In this JokeBook you can find " + manager.getArraySize() + " joke / jokes");
		 System.out.println("Printing jokes:");
		 manager.printJokes();
		 */
		 UserInterface ui = new UserInterface(manager, scanner);
		 ui.start();
		 
		 
	 }
}
