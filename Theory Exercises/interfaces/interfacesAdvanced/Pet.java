abstract public class Pet {
	private String name;

	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name=name;
	}

	abstract void isLoved();
}
