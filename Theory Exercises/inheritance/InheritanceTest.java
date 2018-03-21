class Calculation {
	int z;

	public void addition(int x, int y){
		z= x + y;
		System.out.println("sum="+z);
	}
	public void subtraction(int x, int y){
		z= x - y;
		System.out.println("difference="+z);
	}
	public Calculation(int z) {
		this.z = z;
	}
}
 class My_Calculation  extends Calculation{
	private int y;
	public My_Calculation(int z, int y) {
		super(z);
		this.y=y;
	}

	public void multiplication(int x, int y){
		z= x * y;
		System.out.println("prouct="+z);
	}
}
public class InheritanceTest  extends Object{
	   public static void main(String[] args) {
		   int a = 20, b =10;
		   My_Calculation myObject = new My_Calculation(6,10);
		   myObject.addition(a, b);
		   myObject.multiplication(a, b);
		   myObject.subtraction(a, b);
	   }
}