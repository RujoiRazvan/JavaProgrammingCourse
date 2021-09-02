package Part7.LiquidContainers;

import java.util.Scanner;

public class LiquidContainers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstContainer = 0;
		int secondContainer = 0;
		int maxVolume = 100;
		while(true) {
			System.out.println("First " + firstContainer + "/" + maxVolume);
			System.out.println("Second: " + secondContainer + "/" + maxVolume);
			String input = scanner.nextLine();
			if (input.equals("quit")) {
				break;
	        }
			String[] parts = input.split(" ");
			String command = parts[0];
			int amount = Integer.valueOf(parts[1]);
			if(command.equals("add") && amount >= 0 && (firstContainer + amount <= maxVolume)) {
				firstContainer+=amount;
			}
			if(command.equals("move") && amount >= 0  && secondContainer + amount <= maxVolume) {
				if(amount > firstContainer && secondContainer + firstContainer <= maxVolume) {
					secondContainer = secondContainer + firstContainer;
					firstContainer = 0;
				}
				else {
					secondContainer+=amount;
					firstContainer-=amount;
				}
			}
			if(command.equals("remove") && amount >= 0) {
				if(amount >= secondContainer)
					secondContainer = 0;
				else
					secondContainer-=amount;
			}
			
		}
	}
}
