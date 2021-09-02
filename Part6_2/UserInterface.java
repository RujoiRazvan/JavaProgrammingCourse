package Part6_2;

import java.util.Scanner;

public class UserInterface {
	private Scanner scanner;
	private TodoList todoList;
	public UserInterface(TodoList todolist, Scanner scanner) {
		this.todoList = todolist;
		this.scanner = scanner;
	}
	public void start() {
		while(true) {
			System.out.print("Command: ");
			String UI = scanner.nextLine();
			if(UI.equals("add")) {
				System.out.print("To add: ");
				String toAdd = scanner.nextLine();
				todoList.add(toAdd);
			}
			if(UI.equals("list")) {
				todoList.print();
			}
			if(UI.equals("remove")) {
				System.out.println("Which one is removed?");
				int index = Integer.valueOf(scanner.nextInt());
				todoList.remove(index);
			}
			if(UI.equals("stop"))
				break;
		}
	}
}
