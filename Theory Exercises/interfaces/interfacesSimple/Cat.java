public class Cat extends Pet implements Animal{

	@Override
	public void walk() {
		System.out.println("Hello I am a walking cat!");
	}
	@Override
	public void run() {
		System.out.println("Run cat run!!");
	}

}
