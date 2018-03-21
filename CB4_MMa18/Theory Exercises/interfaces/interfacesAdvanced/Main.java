public class Main {

	public static void main(String[] args) {
		System.out.println("Our Mammals live in planet "+ Mammal.planet);

		Mammal mammal = new Dog();
		Dog myDog = (Dog) mammal;
		myDog.setName("Mitsos");
		System.out.println("My Dog's name is "+myDog.getName());
		System.out.println("He is alive: " +myDog.isAlive());
		System.out.print("And runs like this: ");
		myDog.run();

		Cat myCat = new Cat();
		myCat.die();
		System.out.println("\n\nMy cat is alive: "+myCat.isAlive());
		System.out.println("Sad.. :(");
	}
}
