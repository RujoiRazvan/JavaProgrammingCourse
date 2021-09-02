package Part6_2.JokeManager;

import java.util.Scanner;

public class UserInterface {
	private JokeManager jokes;
	private Scanner scanner;
	public UserInterface(JokeManager jokes, Scanner scanner) {
		this.jokes = jokes;
		this.scanner = scanner;
	}
	public void start() {
		while(true) {
			System.out.println("All commands");
			System.out.println("1 - add a joke");
			System.out.println("2 - draw a joke");
			System.out.println("3 - list jokes");
			System.out.println("x - stop");
			System.out.print("Command: ");
			String command = scanner.nextLine();
			if(command.equals("x")) {
				break;
			}
			if(command.equals("1")) {
				System.out.print("Write the joke to be added: ");
				String addJoke = scanner.nextLine();
				jokes.addJoke(addJoke);
			}
			if(command.equals("2")) {
				System.out.print("Draw a random joke: ");
				System.out.println(jokes.drawJokes());
			}
			if(command.equals("3")) {
				System.out.println("Print all jokes: ");
				jokes.printJokes();
			}
		}
	}
}
