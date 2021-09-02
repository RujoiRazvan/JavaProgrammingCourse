package Part6_2;

import java.util.Scanner;

public class TextUI {
	Scanner scanner = new Scanner(System.in);
	 private SimpleDictionary simpleDictionary;
	public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
		 this.scanner = scanner;
		this.simpleDictionary = simpleDictionary;
	}
	public void start() {
		
		while(true) {
			System.out.print("Command: ");
			String userInput = scanner.nextLine();
			if(userInput.equals("end")) {
				System.out.println("bye bye");
				break;
			}
			else if(userInput.equals("add")) {
				System.out.print("Word: ");
				String word = scanner.nextLine();
				System.out.print("Translation: ");
				String translation = scanner.nextLine();
				simpleDictionary.add(word, translation);
			}else if(userInput.equals("search")) {
				System.out.print("To be translated: ");
				String toBeTranslated = scanner.nextLine();
				System.out.print("Translation: ");
				String translated = simpleDictionary.translate(toBeTranslated);
				if(translated == null) 
					System.out.println("Word " + toBeTranslated + " was not found");
				else
					System.out.println(translated);
			}else
				System.out.println("Unknown command");
		}
	}
}
