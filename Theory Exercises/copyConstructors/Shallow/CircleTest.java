public class CircleTest {
	public static void main(String[] args) {
		Creator creator = new Creator ("Antonis");
		Circle c1 = new Circle( 5,3,2,creator);
		Circle c2 = new Circle(c1);

		System.out.println(c1);
		System.out.println(c2);

		if (c1.equals(c2)){
			System.out.println("same circles!");
		}
		else {
			System.out.println("different circles");
		}
		if (c1.getCreator().equals(c2.getCreator())){
			System.out.println("same creator!");
		}
	}
}