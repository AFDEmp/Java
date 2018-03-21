public  class Circle extends Shape {
	protected double radius;
	public Circle(String colour, double radius) {
		super(colour);
		this.radius=radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", colour=" + this.colour + "]";
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(radius,2);
	}
}
