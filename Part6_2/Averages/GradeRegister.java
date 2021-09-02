package Part6_2.Averages;

import java.util.ArrayList;

public class GradeRegister {
	 private ArrayList<Integer> grades;
	 private ArrayList<Integer> points;
	public GradeRegister() {
		this.grades = new ArrayList<>();
		this.points = new ArrayList<>();
	}
	public double averageOfGrades() {
		double sum = 0;
		if(grades.isEmpty())
			return -1;
		else {
			for(Integer entry: grades) {
				sum = sum + entry;
			}
		}
		return 1.0*sum/this.grades.size();
	}
	public void addGradeBasedOnPoints(int points) {
		this.points.add(points);
		if (points < 50) {
			this.grades.add(0);
        } else if (points < 60) {
        	this.grades.add(1);
        } else if (points < 70) {
        	this.grades.add(2);
        } else if (points < 80) {
        	this.grades.add(3);
        } else if (points < 90) {
        	this.grades.add(4);
        } else {
        	this.grades.add(5);
        }

	}
	
	public double averageOfPoints() {
		double sum = 0;
		for(Integer entry : points) {
			sum = sum + entry;
		}
		return sum / this.points.size();
	}
	
	public int numberOfGrades(int grade) {
		int k = 0;
		for(int received : this.grades) {
			if(received == grade)
				k++;
		}
		return k;
	}
}
