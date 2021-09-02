package Part6_2.JokeManager;

import java.util.ArrayList;

public class JokeManager {
	ArrayList<String> jokesList;
	public JokeManager() {
		this.jokesList = new ArrayList<>();
	}
	public void addJoke(String joke) {
		if(jokesList.contains(joke) == false)
			jokesList.add(joke);
	}
	public String drawJokes() {
		String randomJoke = "";
		for (int i = 0; i < jokesList.size(); i++) 
        {
            int index = (int)(Math.random() * jokesList.size());
            randomJoke = jokesList.get(index);
        }
		return randomJoke;
	}
	public int getArraySize() {
		return jokesList.size();
	}
	public void printJokes() {
		for(String entry : jokesList) {
			System.out.println(entry);
		}
	}
}
