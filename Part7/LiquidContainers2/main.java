package Part7.LiquidContainers2;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Container firstContainer = new Container();
		Container secondContainer = new Container();
		Container container = new Container();
		/*System.out.println(container);

		container.add(50);
		System.out.println(container);
		System.out.println(container.contains());

		container.remove(60);
		System.out.println(container);

		container.add(200);
		System.out.println(container);
		*/
		int maxVolume = 100;
		while(true) {
			System.out.println("First " + firstContainer);
			System.out.println("Second: " + secondContainer);
			String input = scanner.nextLine();
			if (input.equals("quit")) {
				break;
	        }
			String[] parts = input.split(" ");
			String command = parts[0];
			int amount = Integer.valueOf(parts[1]);
			if(command.equals("add")) {
				firstContainer.add(amount);
			}
			if(command.equals("move")) {
                if ((firstContainer.contains() - amount) >= 0) {
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                } else {
                    int moveBuffer = firstContainer.contains();
                    firstContainer.remove(firstContainer.contains());
                    secondContainer.add(firstContainer.contains() + moveBuffer);
                }
			}
			if(command.equals("remove")) {
				secondContainer.remove(amount);
			}
			
		}
	}
}
