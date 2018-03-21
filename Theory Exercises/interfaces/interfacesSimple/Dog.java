public class Dog extends Pet implements Animal{

	@Override
	public void walk() {
		System.out.println("Hello I am a walking dog!");

	}

	@Override
	public void run() {
		System.out.println("Run dog run!!");
	}
}
