package oops.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		animal.appearance(2, 4);
		animal.sound("...");
		
		Dog dog = new Dog();
		
		dog.appearance(2, 4);
		dog.sound("Bark");
		
		Cat cat = new Cat();
		
		cat.sound("Meaw");
		
		Animal petDog = new Dog();
		petDog.sound("Bark");

		
		Animal petTurtle = new Turtle();
		petTurtle.sound("...");
	}

}
