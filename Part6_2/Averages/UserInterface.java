package Part6_2.Averages;

import java.util.Scanner;

import Part6_2.JokeManager.JokeManager;

public class UserInterface {
	private GradeRegister grades;
	private Scanner scanner;
	public UserInterface(GradeRegister grades, Scanner scanner) {
		this.grades = manager;
		this.scanner = scanner;
	}
	public void start() {
		System.out.println("All comands are: add, stop and list");
		while(true) {
			String prevCommand = "";
			System.out.print("Command: ");
			String command = scanner.nextLine();
			if(command.equals("add")) {
				System.out.print("Add points: ");
				int points = scanner.nextInt();
				grades.addGradeBasedOnPoints(points);
				prevCommand = command;
			}
			if(command.equals("stop")) {
				break;
			}
			if(command.equals("list")) {
				int grade = 5;
				while(grade >= 0) {
					System.out.print(grade + ": ");
					int star = grades.numberOfGrades(grade);
					while(star > 0) {
						System.out.print('*');
						star--;
					}
					grade --;
					System.out.println();
				}
				if(grades.averageOfGrades() == -1)
					System.out.println("There are no grades added");
				else {
					System.out.println("Average of grades is: " + grades.averageOfGrades());
					System.out.println("Average of grade (points) is: " + grades.averageOfPoints());
				}
			}
			
		}
	}
}
