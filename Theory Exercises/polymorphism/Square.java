public class Square extends Shape {
	protected double side;

	public Square(String colour,double side) {
		super(colour);
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", colour=" + colour + "]";
	}

	public double getSide() {
		return side;
	}

	@Override
	public double getArea() {
		return side*side;
	}


}
