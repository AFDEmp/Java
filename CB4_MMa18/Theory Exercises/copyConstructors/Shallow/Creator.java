public class Creator {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Creator [name=" + name + "]";
	}

	public Creator(String name) {
		super();
		this.name = name;
	}




}
