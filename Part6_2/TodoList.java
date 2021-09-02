package Part6_2;

import java.util.ArrayList;

public class TodoList {
	ArrayList<String> Todolist;
	public TodoList() {
		 this.Todolist = new ArrayList<String>();
	}
	public void add(String task) {
		Todolist.add(task);
	}
	public void print() {
		for(String todo : Todolist){
            System.out.println((Todolist.indexOf(todo) + 1) + ": " + todo);
        }
	}
	public void remove(int number) {
		Todolist.remove(number);
	}
}
