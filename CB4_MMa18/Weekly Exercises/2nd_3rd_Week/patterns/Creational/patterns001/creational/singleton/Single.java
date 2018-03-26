package patterns001.creational.singleton;
public class Single {

   //Create an object of Single
   private static Single instance= null;

   //Make the constructor private so that this class cannot be instantiated
   private Single(){}

   //Get the only object available
   public static Single getInstance(){
	   if(instance == null) instance= new Single();
	   return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}