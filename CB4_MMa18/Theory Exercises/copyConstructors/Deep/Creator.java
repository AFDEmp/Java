public class Creator {
	private String name;

	public Creator(String name) {
		this.name = name;
	}

	public Creator(Creator creator) {
		this(creator.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
