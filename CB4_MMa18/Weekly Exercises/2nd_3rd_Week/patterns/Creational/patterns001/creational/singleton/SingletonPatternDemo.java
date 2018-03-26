package patterns001.creational.singleton;
public class SingletonPatternDemo {
   public static void main(String[] args) {

      //Compile Time Error: The constructor SingleObject() is not visible
      //Single single = new Single();

      //Get the only object available
      Single single = Single.getInstance();

      //show the message
      single.showMessage();
   }
}