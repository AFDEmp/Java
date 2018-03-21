public interface Mammal extends Organism{

	String planet ="Earth"; //static final variable

	public void walk();

	default void run(){
		System.out.println("Run animal run!!");
	}

	public void breath();

	public void die();
}
