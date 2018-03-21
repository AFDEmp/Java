public class Circle {

	private int x;
	private int y;
	private int radius;
	private Creator creator;

	public Circle(int x, int y, int r, Creator creator ) {
		this.x = x;
		this.y = y;
		this.radius = r;
		this.creator=creator;
	}

	public Circle(Circle original) {
		this(original.x, original.y, original.radius, original.creator);
		this.creator= new Creator(original.creator);
	}

	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}

	public void setX(int x) {
		this.x=x;
	}

	public Creator getCreator() {
		return creator;
	}

	public void setCreator(Creator creator) {
		this.creator = creator;
	}

}
