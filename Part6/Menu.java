package Part6;

import java.util.ArrayList;

public class Menu {
	private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    public void addMeal(String meal) {
    	if(meals.contains(meal) == false)
    		meals.add(meal);
    	else
    		return;
    }
    public void printMeals() {
    	for (String entry : meals) {
			System.out.println(entry);
		}
    }
    public void clearMenu() {
    	meals.clear();
    }
}
