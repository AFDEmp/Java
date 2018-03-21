public class Main {

	public static void main(String[] args) {
		Animal animal = new Dog();
		Dog myDog = (Dog) animal;
		System.out.println(myDog.getName());
		myDog.run();

		Cat myCat = new Cat();

		System.out.println(Cat.alive);
		Animal.breath();
		//Cat.breath();

		System.out.println(Dog.alive);

		System.out.println(Animal.planet);
	}
}
