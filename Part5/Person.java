package Part5;

public class Person {
	private String name, breeds, petName;
	private Pet pet;
	public Person(String name, Pet pet) {
		this.name = name;
		this.pet = pet;
		/*this.breeds = pet.getBreeds();
		this.petName = pet.getName();*/
	}
	
	public String toString() {
		return name + ", has a friend called " + pet.getName() + ", " + pet.getBreeds();
	}
}
