public class Cat extends Pet implements Mammal{
	private boolean alive = true;
	@Override
	public void walk() {
		System.out.println("Hello I am a walking cat!");
	}
	@Override
	public void run() {
		System.out.println("Run cat run!!");
	}

	@Override
	void isLoved() {
		System.out.println("The cat is well fed");
	}
	@Override
	public boolean isAlive() {
		return alive;
	}
	@Override
	public void breath() {
		System.out.println("Breathing using lungs");
	}
	@Override
	public void die() {
		alive = false;

	}
}
