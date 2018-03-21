public abstract  class Shape {
	protected String colour;

	public Shape(String colour) {
		super();
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Shape [colour=" + colour + "]";
	}
	public abstract double getArea();

}
