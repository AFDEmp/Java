public interface Animal{

	public boolean alive= true;//static final variable
	String planet ="Earth"; //static final variable

	public  void walk();

	default void run(){
		System.out.println("Run animal run!!");
	}

	public static void breath(){
		System.out.println("It is "+ alive +" we are all alive and breathing");
		//planet="Mars"; illegal
	}

}
