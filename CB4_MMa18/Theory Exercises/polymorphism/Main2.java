public class Main2 {
	public static void main(String[] args) {
		Shape [] shapes = new Shape [10];
		shapes [0]= new Circle ("red",10);
		shapes [1]= new Circle ("red",10);
		shapes [2]= new Square ("blue",10);
		shapes [3]= new Square ("green",7);
		shapes [4]= new Square ("black",77);
		//Shape shape = new Shape("red"); invalid


		System.out.println("**Print Shapes**");
		for(Shape currentShapeItem: shapes)
			if(currentShapeItem!=null)
				System.out.println(currentShapeItem);

		for(int i=0; i<shapes.length; i++){
			if(shapes[i]!=null)
				System.out.println(shapes[i]);
		}


		System.out.println("\n**Print Squares**");
		for(Shape shape: shapes)
			if(shape!=null && shape instanceof Square){
				System.out.println(shape.toString());
				//shape.getSide() illegal!!!
				Square s = (Square)shape;
				System.out.println("Area():"+s.getArea()+"\n");
			}
	}
}
