public class Dog extends Pet implements Mammal{
	private boolean alive = true;

	@Override
	public void walk() {
		System.out.println("Hello I am a walking dog!");
	}

	@Override
	public void run() {
		System.out.println("Run dog run!!");
	}

	@Override
	void isLoved() {
		System.out.println("The dog plays outside");
	}

	@Override
	public void breath() {
		System.out.println("Breathing using lungs");
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void die() {
		alive = false;

	}
}
