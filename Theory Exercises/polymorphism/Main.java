public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle("red", 10);
		Square square = new Square ("blue",5);

		Shape shape1= circle;
		Shape shape2= square;
		Circle c =null;
		System.out.println(shape1);
		if(shape1 instanceof Circle){
			 c = (Circle) shape1;
		}
		if(shape2 instanceof Circle){
			Circle c2 = (Circle) shape2;
		}
		if(c instanceof Shape){
			System.out.println("I am a "+ shape1.getClass()+ " object");
		}
	}
}
